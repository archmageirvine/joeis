package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.oeis.a108.A108629;

/**
 * A039983 An example of a d-perfect sequence.
 * @author Sean A. Irvine
 */
public class A039983 extends A108629 {

  @Override
  public Z next() {
    return super.next().isEven() ? Z.ZERO : Z.ONE;
  }
}

