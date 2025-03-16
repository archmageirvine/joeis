package irvine.oeis.a076;

import java.util.HashSet;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.a025.A025475;
import irvine.util.string.StringUtils;

/**
 * A076047 Primes which are the difference between two successive nontrivial prime powers (A025475).
 * @author Sean A. Irvine
 */
public class A076047 extends A025475 implements Conjectural {

  private static final int HEURISTIC = 100;
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final HashSet<Z> mOutput = new HashSet<>();
  private final TreeSet<Z> mSet = new TreeSet<>();
  private Z mA = super.next();
  private Z mPrev = Z.ZERO;

  @Override
  public Z next() {
    for (int k = 0; k < HEURISTIC || mSet.isEmpty(); ++k) {
      final Z t = mA;
      mA = super.next();
      final Z d = mA.subtract(t);
      if (d.isProbablePrime()) {
        if (d.compareTo(mPrev) < 0 && mOutput.add(d)) {
          throw new RuntimeException("Heuristic failed: " + d + " is a term of the sequence and should have been output earlier");
        }
        if (mVerbose) {
          StringUtils.message(d + " is a member of the sequence");
        }
        mSet.add(d);
      }
    }
    mPrev = mSet.pollFirst();
    mOutput.add(mPrev);
    return mPrev;
  }
}
