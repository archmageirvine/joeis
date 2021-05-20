package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047770 a(n) = A047769(2n).
 * @author Sean A. Irvine
 */
public class A047770 extends A047769 {

  @Override
  public Z next() {
    super.next();
    return super.next();
  }
}
