package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.oeis.a007.A007317;

/**
 * A039972 An example of a d-perfect sequence: a(n) = A007317(n) mod 3.
 * @author Sean A. Irvine
 */
public class A039972 extends A007317 {

  @Override
  public Z next() {
    return super.next().mod(Z.THREE);
  }
}

