package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.DynamicArray;

/**
 * A054398 Define a sequence of 2^n X 2^n squares as follows: S_0 = [1], S_1 = [1,2; 3,4]; S_2 = [1,2,5,6; 3,4,7,8; 9,10,13,14; 11,12,15,16], etc.; sequence gives triangular array whose n-th row gives differences between successive columns of n-th square.
 * @author Sean A. Irvine
 */
public class A054398 implements Sequence {

  private final DynamicArray<Z> mA = new DynamicArray<>();
  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM >= mA.length()) {
      if (++mN == 0) {
        mA.set(0, Z.ONE);
      } else {
        final int t = mA.length();
        mA.set(t, Z.ONE.shiftLeft(2 * mN + 1).add(1).divide(3));
        for (int k = 0; k < t; ++k) {
          mA.set(t + k + 1, mA.get(k));
        }
      }
      mM = 0;
    }
    return mA.get(mM);
  }
}
