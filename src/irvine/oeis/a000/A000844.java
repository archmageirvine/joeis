package irvine.oeis.a000;

import irvine.math.polynomial.CycleIndex;
import irvine.math.z.Z;

/**
 * A000844 Number of switching networks (see Harrison reference for precise definition).
 * @author Sean A. Irvine
 */
public class A000844 extends A000721 {

  @Override
  public Z next() {
    final CycleIndex ans = f(++mN);
    return ans.apply(2).add(ans.apply(0, 2).multiply(3)).divide(4).toZ();
  }
}
