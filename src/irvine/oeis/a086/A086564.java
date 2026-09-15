package irvine.oeis.a086;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicIntArray;

/**
 * A086564 Smallest k such that 10^k + 1 has n distinct prime divisors.
 * @author Sean A. Irvine
 */
public class A086564 extends Sequence1 {

  private final DynamicIntArray mFirsts = new DynamicIntArray();
  private Z mT = Z.ONE;
  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    while (mFirsts.get(mN) == 0) {
     mT = mT.multiply(10);
     ++mM;
     final Z c = mT.add(1);
     final int omega = Functions.OMEGA.i(c);
     if (mFirsts.get(omega) == 0) {
       mFirsts.set(omega, mM);
     }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
