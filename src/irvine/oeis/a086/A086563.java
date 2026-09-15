package irvine.oeis.a086;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicArray;

/**
 * A086563 Smallest number of the form 10^k +1 with n distinct prime divisors.
 * @author Sean A. Irvine
 */
public class A086563 extends Sequence1 {

  private final DynamicArray<Z> mFirsts = new DynamicArray<>();
  private Z mT = Z.ONE;
  private int mN = 0;
  {
    mFirsts.set(1, Z.TWO);
  }

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == null) {
     mT = mT.multiply(10);
     final Z c = mT.add(1);
     final int omega = Functions.OMEGA.i(c);
     if (mFirsts.get(omega) == null) {
       mFirsts.set(omega, c);
     }
    }
    return mFirsts.get(mN);
  }
}
