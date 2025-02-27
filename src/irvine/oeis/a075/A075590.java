package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a014.A014574;
import irvine.util.array.DynamicArray;

/**
 * A075590 Smallest number with n distinct prime divisors which is the average of a twin prime pair.
 * @author Sean A. Irvine
 */
public class A075590 extends A014574 {

  private final DynamicArray<Z> mFirsts = new DynamicArray<>();
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == null) {
      final Z t = super.next();
      final int omega = Functions.OMEGA.i(t);
      if (mFirsts.get(omega) == null) {
        mFirsts.set(omega, t);
      }
    }
    return mFirsts.get(mN);
  }
}

