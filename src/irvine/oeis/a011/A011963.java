package irvine.oeis.a011;

import irvine.math.z.Z;

/**
 * A011963 Number of ferrites M_8Y_n that repeat after 6n+40 layers.
 * @author Sean A. Irvine
 */
public class A011963 extends A011961 {

  private int mN = 0;

  @Override
  public Z next() {
    return f(8, ++mN);
  }
}
