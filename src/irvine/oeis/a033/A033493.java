package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A033493 Sum of the numbers in the trajectory of n for the 3x+1 problem.
 * @author Sean A. Irvine
 */
public class A033493 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    Z m = mN;
    Z sum = m;
    while (!Z.ONE.equals(m)) {
      m = m.isEven() ? m.divide2() : m.multiply(3).add(1);
      sum = sum.add(m);
    }
    return sum;
  }
}
