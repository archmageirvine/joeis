package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002113;
import irvine.util.array.DynamicArray;

/**
 * A062388.
 * @author Sean A. Irvine
 */
public class A070244 extends A002113 {

  private final DynamicArray<Z> mA = new DynamicArray<>();
  private int mN = -1;
  private Z mPalindrome = super.next();

  /** Construct the sequence. */
  public A070244() {
    setOffset(0);
  }

  @Override
  public Z next() {
    ++mN;
    while (mA.get(mN) == null || mA.get(mN).toString().length() == mPalindrome.toString().length()) {
      final int digitSum = Functions.DIGIT_SUM.i(mPalindrome);
      final Z existing = mA.get(digitSum);
      if (existing == null || existing.toString().length() == mPalindrome.toString().length()) {
        mA.set(digitSum, mPalindrome);
      }
      mPalindrome = super.next();
    }
    return mA.get(mN);
  }
}
