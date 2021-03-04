package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.oeis.a108.A108623;

/**
 * A039978 An example of a d-perfect sequence.
 * @author Sean A. Irvine
 */
public class A039978 extends A108623 {

  @Override
  public Z next() {
    return super.next().mod(Z.THREE);
  }
}

