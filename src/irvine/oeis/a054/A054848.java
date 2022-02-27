package irvine.oeis.a054;

import irvine.math.z.Z;

/**
 * A054848 n - nearest integer to (nearest integer to n^(2/3))^(3/2).
 * @author Sean A. Irvine
 */
public class A054848 extends A054847 {

  @Override
  public Z next() {
    return Z.valueOf(mN + 1).subtract(super.next());
  }
}
