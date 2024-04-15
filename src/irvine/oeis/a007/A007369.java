package irvine.oeis.a007;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A007369 Numbers n such that sigma(x) = n has no solution.
 * @author Sean A. Irvine
 */
public class A007369 extends Sequence1 {

  private final LongDynamicBooleanArray mA = new LongDynamicBooleanArray();
  private long mN = 0;
  private long mS = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      while (mN >= mS || mN >= mA.length()) {
        final long sigma = Functions.SIGMA.z(++mS).longValueExact();
        mA.set(sigma);
      }
      if (!mA.isSet(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
