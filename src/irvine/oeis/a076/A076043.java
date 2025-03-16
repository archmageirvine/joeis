package irvine.oeis.a076;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;
import irvine.util.string.StringUtils;

/**
 * A076043 a(1)=2; for n&gt;1, a(n) is smallest squarefree number (greater than 1) not occurring earlier such that a(n) + a(n-1) is a square.
 * @author Sean A. Irvine
 */
public class A076043 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();
  private Z mA = null;
  private long mS = 3; // Tracks smallest unused number

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.TWO;
      return Z.TWO;
    }
    if (mVerbose) {
      StringUtils.message("Least unused: " + mS);
    }
    long k = mS;
    while (true) {
      if (!mUsed.isSet(k)) {
        if (Predicates.SQUARE_FREE.is(k)) {
          if (Predicates.SQUARE.is(mA.add(k))) {
            mUsed.set(k);
            mA = Z.valueOf(k);
            while (mUsed.isSet(mS)) {
              ++mS;
            }
            return mA;
          }
        } else {
          mUsed.set(k); // so we never test square free status again
        }
      }
      ++k;
    }
  }
}
