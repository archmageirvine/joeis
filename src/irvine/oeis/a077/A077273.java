package irvine.oeis.a077;

import java.util.HashSet;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.a025.A025475;
import irvine.util.string.StringUtils;

/**
 * A076707 Ordered differences without repetitions between two successive prime powers of prime numbers.
 * @author Sean A. Irvine
 */
public class A077273 extends A025475 implements Conjectural {

  private static final int HEURISTIC = 10;
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final HashSet<Z> mSeen = new HashSet<>();
  private final TreeSet<Z> mSorted = new TreeSet<>();
  private Z mPrev = Z.ZERO;
  private Z mA = super.next();

  @Override
  public Z next() {
    while (mSorted.size() <= HEURISTIC || mSorted.first().multiply2().square().compareTo(mSorted.last()) > 0) {
      final Z t = mA;
      mA = super.next();
      final Z d = mA.subtract(t);
      if (mSeen.add(d)) {
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
