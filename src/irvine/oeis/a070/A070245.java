package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002385;
import irvine.util.array.DynamicArray;

/**
 * A062388.
 * @author Sean A. Irvine
 */
public class A070245 extends A002385 {

  private final DynamicArray<Z> mA = new DynamicArray<>();
  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 1 || mN == 4 || (mN > 3 && mN % 3 == 0)) {
      return Z.ZERO;
    }
    while (mA.get(mN) == null) {
      final Z p = super.next();
      final int digitSum = Functions.DIGIT_SUM.i(p);
      if (mA.get(digitSum) == null) {
        mA.set(digitSum, p);
      }
    }
    return mA.get(mN);
  }
}
