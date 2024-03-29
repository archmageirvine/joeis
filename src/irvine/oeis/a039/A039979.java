package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.oeis.a007.A007440;

/**
 * A039979 An example of a d-perfect sequence.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A039979 extends A007440 {

  @Override
  public Z next() {
    return super.next().mod(Z.THREE);
  }
}
