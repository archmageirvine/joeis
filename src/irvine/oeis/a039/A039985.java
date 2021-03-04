package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.oeis.a108.A108630;

/**
 * A039985 An example of a d-perfect sequence.
 * @author Sean A. Irvine
 */
public class A039985 extends A108630 {

  @Override
  public Z next() {
    return super.next().isEven() ? Z.ZERO : Z.ONE;
  }
}

