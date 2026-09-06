package irvine.oeis.a086;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicArray;

/**
 * A086487 Smallest number with n prime divisors such that the sum of the prime divisors is also a divisor, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A086487 extends Sequence1 {

  // too slow to be useful

  private final Sequence mA = new A086486();
  private final DynamicArray<Z> mFirsts = new DynamicArray<>();
  private int mN = 0;
  {
    mFirsts.set(2, Z.ZERO);
  }

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == null) {
      final Z t = mA.next();
      final int omega = Functions.OMEGA.i(t);
      if (mFirsts.get(omega) == null) {
        mFirsts.set(omega, t);
      }
    }
    return mFirsts.get(mN);
  }
}

