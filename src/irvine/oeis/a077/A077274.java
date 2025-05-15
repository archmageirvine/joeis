package irvine.oeis.a077;

import java.util.HashMap;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.a025.A025475;
import irvine.util.string.StringUtils;

/**
 * A077274 Differences between two successive powers of a prime but not a prime (A025475) in more than one way.
 * @author Sean A. Irvine
 */
public class A077274 extends A025475 implements Conjectural {

  private static final int HEURISTIC = 10;
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final HashMap<Z, Long> mSeen = new HashMap<>();
  private final TreeSet<Z> mSorted = new TreeSet<>();
  private Z mPrev = Z.ZERO;
  {
    super.next(); // skip 1
  }
  private Z mA = super.next();

  @Override
  public Z next() {
    while (mSorted.size() <= HEURISTIC || mSorted.first().square().compareTo(mSorted.last()) > 0) {
      final Z t = mA;
      mA = super.next();
      final Z d = mA.subtract(t);
      if (mSeen.merge(d, 1L, Long::sum) == 2) {
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
