package irvine.oeis.a006;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.a002.A002997;
import irvine.util.array.DynamicArray;

/**
 * A006931 Least Carmichael number with n prime factors, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A006931 extends A002997 {

  private final DynamicArray<Z> mLeast = new DynamicArray<>();
  private int mN = 2;

  @Override
  public Z next() {
    ++mN;
    while (mLeast.get(mN) == null) {
      final Z n = super.next();
      final int o = Cheetah.factor(n).omega();
      if (mLeast.get(o) == null) {
        mLeast.set(o, n);
      }
    }
    return mLeast.get(mN);
  }
}
