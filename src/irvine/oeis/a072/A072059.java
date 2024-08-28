package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;
import irvine.util.array.DynamicArray;

/**
 * A072005.
 * @author Sean A. Irvine
 */
public class A072059 extends A000040 {

  private final DynamicArray<Z> mFirsts = new DynamicArray<>();
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == null) {
      final Z p = super.next();
      final int omega = Functions.OMEGA.i(p.multiply(2).add(1));
      if (mFirsts.get(omega) == null) {
        mFirsts.set(omega, p);
      }
    }
    return mFirsts.get(mN);
  }
}
