package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047982 a(n) = A047980(2n+1).
 *
 * @author Sean A. Irvine
 */
public class A047982 extends A047980 {

  @Override
  public Z next() {
    final Z res = super.next();
    super.next();
    return res;
  }
}
