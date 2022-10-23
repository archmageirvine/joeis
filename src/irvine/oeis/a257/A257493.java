package irvine.oeis.a257;

import java.util.HashMap;

import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.Pair;

/**
 * A257493 Number A(n,k) of n X n nonnegative integer matrices with all row and column sums equal to k; square array A(n,k), n &gt;= 0, k &gt;= 0, read by antidiagonals.
 * @author Sean A. Irvine
 */
public class A257493 extends Sequence0 {

  private final HashMap<Pair<String, Integer>, Z> mCache = new HashMap<>();
  private final Fast mPrime = new Fast();
  private int mN = -1;
  private int mM = 0;

  private FactorSequence factor(Z n, final Z[] primes) {
    // We already know all the primes in n
    final FactorSequence fs = new FactorSequence();
    for (final Z p : primes) {
      while (true) {
        final Z[] qr = n.divideAndRemainder(p);
        if (!qr[1].isZero()) {
          break;
        }
        n = qr[0];
        fs.add(p, FactorSequence.PRIME, 1);
      }
    }
    return fs;
    //return Jaguar.factor(n);
  }

  private Z compute(final FactorSequence fs, final int k) {
    final Z[] primes = fs.toZArray();
    if (primes.length == 0 || (primes.length == 1 && Z.ONE.equals(primes[0]))) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (final Z d : fs.divisors()) {
      if (d.compareTo(Z.ONE) > 0) {
        final FactorSequence fsd = factor(d, primes);
        if (fsd.bigOmega() == k) {
          // n / d
          final FactorSequence nd = new FactorSequence();
          for (final Z p : fs.toZArray()) {
            final int e = fs.getExponent(p) - fsd.getExponent(p);
            if (e > 0) {
              nd.add(p, FactorSequence.PRIME, e);
            }
          }
          sum = sum.add(get(nd, k));
        }
      }
    }
    return sum;
  }

  private Z get(final FactorSequence fs, final int k) {
    // No equals defined on FactorSequence -- probably should be
    final Pair<String, Integer> key = new Pair<>(fs.toString(), k);
    final Z res = mCache.get(key);
    if (res != null) {
      return res;
    }
    final Z r = compute(fs, k);
    mCache.put(key, r);
    return r;
  }

  protected Z a(final long n, final int k) {
    long p = 1;
    final FactorSequence fs = new FactorSequence();
    for (long i = 0; i < n; ++i) {
      p = mPrime.nextPrime(p);
      fs.add(p, FactorSequence.PRIME, k);
    }
    return get(fs, k);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return a(mM, mN - mM);
  }
}
