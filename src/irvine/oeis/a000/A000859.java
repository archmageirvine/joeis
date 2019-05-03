package irvine.oeis.a000;

import irvine.math.polynomial.CycleIndex;
import irvine.math.z.Z;

/**
 * A000859 Number of <code>n-input 2-output</code> switching networks under action of <code>S(n)</code> and complementing group <code>C(2,2)</code> on inputs and outputs.
 * @author Sean A. Irvine
 */
public class A000859 extends A000721 {

  @Override
  public Z next() {
    final CycleIndex ans = f(++mN);
    return ans.apply(2)
      .add(ans.apply(0, 2).multiply(3))
      .add(ans.apply(1, 2).multiply(2))
      .add(ans.apply(0, 0, 0, 2).multiply(2))
      .divide(8).toZ();
  }
}
