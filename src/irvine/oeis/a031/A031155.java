package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031155 a(n) = 2^A031140(n).
 * @author Sean A. Irvine
 */
public class A031155 extends A031140 {

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(super.next().longValueExact());
  }
}
