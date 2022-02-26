package irvine.oeis.a054;

import irvine.math.z.Z;

/**
 * A054845.
 * @author Sean A. Irvine
 */
public class A054848 extends A054847 {

  @Override
  public Z next() {
    return Z.valueOf(mN + 1).subtract(super.next());
  }
}
