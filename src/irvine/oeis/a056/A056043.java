package irvine.oeis.a056;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a055.A055772;

/**
 * A056043 Let k be largest number such that k^2 divides n!; a(n) = k/floor(n/2)!.
 * @author Sean A. Irvine
 */
public class A056043 extends A055772 {

  @Override
  public Z next() {
    return super.next().divide(Functions.FACTORIAL.z(mN / 2));
  }
}
