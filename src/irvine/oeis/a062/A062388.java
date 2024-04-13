package irvine.oeis.a062;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002113;
import irvine.util.array.DynamicArray;

/**
 * A062388 Smallest palindrome with digit sum = n.
 * @author Sean A. Irvine
 */
public class A062388 extends A002113 {

  private final DynamicArray<Z> mA = new DynamicArray<>();
  private int mN = -1;

  /** Construct the sequence. */
  public A062388() {
    setOffset(0);
  }

  @Override
  public Z next() {
    ++mN;
    while (mA.get(mN) == null) {
      final Z p = super.next();
      final int digitSum = (int) Functions.DIGIT_SUM.l(p);
      if (mA.get(digitSum) == null) {
        mA.set(digitSum, p);
      }
    }
    return mA.get(mN);
  }
}
