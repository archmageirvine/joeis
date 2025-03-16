package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;
import irvine.util.string.StringUtils;

/**
 * A076990 a(1) = 1, a(2) = 2; thereafter a(n) = smallest number not occurring earlier such that the sum of three successive terms is prime.
 * @author Sean A. Irvine
 */
public class A076990 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();
  private Z mA = null;
  private Z mB = null;
  private long mS = 3; // Tracks smallest unused number

  protected Z select(final Z a, final Z b, final Z c) {
    return c;
  }

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ONE;
        return select(Z.ZERO, Z.ZERO, Z.ONE);
      }
      mB = Z.TWO;
      return select(Z.ZERO, Z.ZERO, Z.TWO);
    }
    if (mVerbose) {
      StringUtils.message("Least unused: " + mS);
    }
    long k = mS;
    final Z t = mA.add(mB);
    while (true) {
      if (!mUsed.isSet(k)) {
        final Z u = t.add(k);
        if (u.isProbablePrime()) {
          mUsed.set(k);
          final Z v = mA;
          mA = mB;
          mB = Z.valueOf(k);
          while (mUsed.isSet(mS)) {
            ++mS;
          }
          return select(v, mA, mB);
        }
      }
      ++k;
    }
  }
}
