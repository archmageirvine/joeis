package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.oeis.a006.A006318;

/**
 * A039975 An example of a d-perfect sequence: a(n) = A006318(n-1) mod 3.
 * @author Sean A. Irvine
 */
public class A039975 extends A006318 {

  @Override
  public Z next() {
    return super.next().mod(Z.THREE);
  }
}

