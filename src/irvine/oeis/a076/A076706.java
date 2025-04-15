package irvine.oeis.a076;

import java.util.HashSet;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.a053.A053810;
import irvine.util.string.StringUtils;

/**
 * A076706 Primes which are the difference between two successive prime powers of prime numbers.
 * @author Sean A. Irvine
 */
public class A076706 extends A053810 implements Conjectural {

  private static final int HEURISTIC = 2;
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final HashSet<Z> mSeen = new HashSet<>();
  private final TreeSet<Z> mSorted = new TreeSet<>();
  private Z mPrev = Z.ZERO;
  private Z mA = super.next();

  @Override
  public Z next() {
    while (mSorted.size() <= HEURISTIC) {
      final Z t = mA;
      mA = super.next();
      final Z d = mA.subtract(t);
      if (d.isProbablePrime() && mSeen.add(d)) {
        if (mVerbose) {
          StringUtils.message(d + " is in the sequence");
        }
        if (d.compareTo(mPrev) < 0) {
          throw new RuntimeException("Heuristic failed: " + d + " should have been output earlier");
        }
        mSorted.add(d);
      }
    }
    mPrev = mSorted.pollFirst();
    return mPrev;
  }
}
