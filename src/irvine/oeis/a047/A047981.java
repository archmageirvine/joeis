package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047981 a(n) = A047980(2n).
 *
 * @author Sean A. Irvine
 */
public class A047981 extends A047980 {

  @Override
  public Z next() {
    super.next();
    return super.next();
  }
}
