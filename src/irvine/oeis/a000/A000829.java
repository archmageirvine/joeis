package irvine.oeis.a000;

import irvine.math.polynomial.CycleIndex;
import irvine.math.z.Z;

/**
 * A000829.
 * @author Sean A. Irvine
 */
public class A000829 extends A000721 {

  @Override
  public Z next() {
    final CycleIndex ans = f(++mN);
    return ans.apply(2).add(ans.apply(1, 2)).divide(2).toZ();
  }
}
