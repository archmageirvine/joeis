package irvine.oeis.a000;

import irvine.math.polynomial.CycleIndex;
import irvine.math.z.Z;

/**
 * A000654 Invertible Boolean functions of n variables.
 * @author Sean A. Irvine
 */
public class A000654 extends A000721 {

  @Override
  public Z next() {
    final CycleIndex ans = f(++mN);
    return ans.invertible(ans);
  }
}
