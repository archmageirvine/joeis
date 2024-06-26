package irvine.oeis.a048;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A048995 Numbers that are not the sum of the nontrivial factors (excluding 1 and n) of some natural number.
 * @author Sean A. Irvine
 */
public class A048995 extends Sequence1 {

  private final LongDynamicBooleanArray mA = new LongDynamicBooleanArray();
  private long mN = 0;
  private long mS = 1;

  @Override
  public Z next() {
    while (true) {
      if (++mN == 1) {
        return Z.ONE;
      }
      while (mN * mN >= mS || mN >= mA.length()) {
        final long sigma = Functions.SIGMA1.l(++mS);
        mA.set(sigma - mS - 1);
      }
      if (!mA.isSet(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
