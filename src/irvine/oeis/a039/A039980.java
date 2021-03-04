package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.oeis.a108.A108624;

/**
 * A039980 An example of a d-perfect sequence.
 * @author Sean A. Irvine
 */
public class A039980 extends A108624 {

  @Override
  public Z next() {
    return super.next().mod(Z.THREE);
  }
}

