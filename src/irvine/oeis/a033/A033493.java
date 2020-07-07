package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033493 Sum of the numbers in the trajectory of n for the <code>3x+1</code> problem.
 * @author Sean A. Irvine
 */
public class A033493 implements Sequence {

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
