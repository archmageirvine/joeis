package irvine.oeis.a058;

import java.util.HashSet;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Conjectural;
import irvine.util.string.StringUtils;

/**
 * A058047 Generalized Collatz sequences: primes resulting in a cycle containing 1.
 * @author Sean A. Irvine
 */
public class A058047 extends AbstractSequence implements Conjectural {

  /* Construct the sequence. */
  public A058047() {
    super(0);
  }

  private static final long HEURISTIC_LIMIT = 10000;
  protected final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  protected final Fast mPrime = new Fast();
  private final HashSet<Z> mSeen = new HashSet<>();
  protected Z mP = Z.TWO;

  private boolean is(final Z p, final long k) {
    mSeen.clear();
    Z m = Z.valueOf(k);
    while (!Z.ONE.equals(m)) {
      if (!mSeen.add(m)) {
        return false;
      }
      final Z[] f = Jaguar.factor(m).toZArray();
      if (f[0].compareTo(p) < 0) {
        int j = -1;
        while (++j < f.length && f[j].compareTo(p) < 0) {
          m = m.divide(f[j]);
        }
      } else {
        m = m.multiply(p).add(1);
      }
    }
    return true;
  }

  protected boolean is(final Z p) {
    for (long k = 2; k <= HEURISTIC_LIMIT; ++k) {
      if (!is(p, k)) {
        return false;
      }
    }
    return true; // Every value <= HEURISTIC_LIMIT reaches 1
  }

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (mVerbose) {
        StringUtils.message("Testing: " + mP);
      }
      if (is(mP)) {
        return mP;
      }
    }
  }
}
