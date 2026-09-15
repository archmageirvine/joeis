package irvine.oeis.a086;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.DynamicIntArray;

/**
 * A086565 Smallest k such that (10^k - 1)/9 has n distinct prime divisors. Or a(n)= smallest value of k such that A000042(k) has exactly n distinct prime divisors.
 * @author Sean A. Irvine
 */
public class A086565 extends Sequence0 {

  private final DynamicIntArray mFirsts = new DynamicIntArray();
  private Z mT = Z.ONE;
  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0) {
     mT = mT.multiply(10);
     ++mM;
     final Z c = mT.subtract(1).divide(9);
     final int omega = Functions.OMEGA.i(c);
     if (mFirsts.get(omega) == 0) {
       mFirsts.set(omega, mM);
     }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
