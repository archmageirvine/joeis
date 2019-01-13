package irvine.factor.factor;

import irvine.factor.prime.Fast;
import irvine.factor.prime.Prime;
import irvine.factor.util.FactorSequence;
import irvine.factor.util.ListMultiplier;
import irvine.math.z.Montgomery;
import irvine.math.z.Z;
import irvine.util.time.Timer;

import java.util.ArrayList;

/**
 * Implements a two stage version of the <i>p</i>-1 factoring method.
 *
 * @author Sean A. Irvine
 */
public class MontgomeryPMinusOne extends AbstractFactorizer {

  /** Number of iterations to perform per gcd operation */
  private static final int ITERATIONS_PER_GCD = 2000;
  /** Maximum cascade limit. */
  private static final int CASCADE_MAX = 50000000;

  /** First smoothness bound */
  private final long mB1;
  /** Second smoothness bound */
  private final long mB2;
  /** Prime number engine */
  private final Prime mPrime;

  /**
   * Construct a new <i>p</i>-1 factor machine with the specified bounds.
   *
   * @param b1 first smoothness bound
   * @param b2 second smoothness bound
   */
  public MontgomeryPMinusOne(final long b1, final long b2) {
    super();
    mB1 = b1;
    mB2 = b2;
    mPrime = new Fast();
  }

  /** Array containing cached values of b^d. */
  private final ArrayList<Z> mBD = new ArrayList<>();

  /**
   * Get the value of b^difference, caching the result for future use.
   *
   * @param difference the difference, should be nonnegative and even
   * @param b base
   * @param n number to being factored
   * @return b^difference
   */
  private Z getBD(final long difference, final Z b, final Z n) {

    assert difference >= 0L : "negative difference in getBD()";
    assert (difference & 1L) == 0L : "odd difference in getBD()";

    final int diff = (int) (difference >> 1);

    // if necessary compute all entries up to requested value
    if (diff >= mBD.size()) {
      if (mBD.isEmpty()) {
        mBD.add(Z.ONE);
      }
      Z bd = mBD.get(mBD.size() - 1);
      for (int i = mBD.size(); i <= diff; ++i) {
        bd = bd.multiply(b).mod(n);
        mBD.add(bd);
      }
    }

    return mBD.get(diff);
  }

  /** Stage 2 of p-1 method. */
  private Z stageTwo(final Z n, Z x, final long lastPrime) {

    // immediate exit if B2 bound gives nothing new
    if (mB2 <= mB1) {
      return null;
    }

    final Timer timer = new Timer();
    timer.start();

    long ipp = lastPrime;
    long jpp = ipp;
    Z g, y = x;
    Z p = Z.ONE;
    final Z bb = x.multiply(x).mod(n);
    x = x.modPow(Z.valueOf(lastPrime), n);

    post:
    while (true) {
      for (int c = 0; c < ITERATIONS_PER_GCD; ++c) {
        final long ip = ipp;
        ipp = mPrime.nextPrime(ipp);
        x = x.multiply(getBD(ipp - ip, bb, n)).mod(n);
        p = p.multiply(x.subtract(Z.ONE)).mod(n);
        if (ip >= mB2) {
          g = n.gcd(p);
          if (g.equals(Z.ONE)) {
            message("Stage 2 took " + timer.getElapsed() + " ms");
            return null;
          }
          break post;
        }
      }

      g = p.gcd(n);
      if (!g.equals(Z.ONE)) {
        break;
      }
      jpp = ipp;
      y = x;
    }

    ipp = jpp;
    x = y;
    do {
      final long ip = ipp;
      ipp = mPrime.nextPrime(ipp);
      x = x.multiply(getBD(ipp - ip, bb, n)).mod(n);
      g = n.gcd(x.subtract(Z.ONE));
    } while (g.equals(Z.ONE));
    message("Stage 2 took " + timer.getElapsed() + " ms");
    if (g.compareTo(n) < 0) {
      return g;
    }
    return null;

  }

  /** Stage 1 of the P-1 method. */
  private Z stageOne(final Z n) {

    final Timer timer = new Timer();
    timer.start();

    final Montgomery mn = new Montgomery(n);

    Z x = mn.toMontgomery(Z.TWO);
    long ip = 1;

    // Cascade limit is set to about 10000 * log_10(N)
    int cascadeLimit = 3000 * n.bitLength();
    if (cascadeLimit > CASCADE_MAX) {
      cascadeLimit = CASCADE_MAX;
    }
    if (cascadeLimit > mB1) {
      cascadeLimit = (int) mB1;
    }

    final ListMultiplier lm = new ListMultiplier();
    // handle small primes with powers
    final long b0 = (long) Math.sqrt(mB1);
    while ((ip = mPrime.nextPrime(ip)) < b0) {
      long q = 1;
      long z = ip;
      do {
        q = z;
        z *= ip;
      } while (z < mB1);
      lm.add(q);
    }

    // keep going to cascade limit
    do {
      lm.add(ip);
      ip = mPrime.nextPrime(ip);
    } while (ip <= cascadeLimit);

    final Z product = lm.product();
    message("Product has " + product.bitLength() + " bits took " + timer.getElapsed() + " ms");

    x = mn.pow(x, product);

    // do the remaining primes in stage 1
    final int maxSize = 16 * n.bitLength();
    Z g = Z.ONE;
    while (ip < mB1) {
      g = g.multiply(ip);
      if (g.bitLength() >= maxSize) {
        x = mn.pow(x, g);
        g = Z.ONE;
      }
      ip = mPrime.nextPrime(ip);
    }
    x = mn.pow(x, g);

    final Z rawx = mn.toZ(x);
    final Z f = n.gcd(rawx.subtract(Z.ONE));
    message("Stage 1 took " + timer.getElapsed() + " ms");
    message("f: " + f);
    if (Z.ONE.equals(f)) {
      return stageTwo(n, rawx, ip);
    }
    if (n.equals(f)) {
      message("Found n as a factor, retry with small B1 bound");
      return null;
    }
    message("Factor: " + f + " took " + timer.getElapsed() + " ms");
    return f;
  }


  @Override
  protected void factor(final FactorSequence fs, Z n) {

    final int exponent = fs.getExponent(n);
    //    final int status = fs.getStatus(n);
    fs.remove(n);
    n = AbstractFactorizer.handleEvenAndNegative(fs, n, exponent);
    if (n.equals(Z.ONE)) {
      return;
    }

    final Z f = stageOne(n);
    if (f != null) {
      fs.add(f, exponent);
      fs.add(n.divide(f), exponent);
    }
  }

  /**
   * Attempt to factor each of the supplied arguments, printing a sorted list of factors.
   *
   * @param args numbers to factor
   */
  public static void main(final String[] args) {
    factorize(new MontgomeryPMinusOne(20000000, 50000000), args);
  }
}
