package irvine.oeis.a011;

import irvine.math.z.Z;

/**
 * A011964 Number of ferrites M_{10}Y_n that repeat after 6n+50 layers.
 * @author Sean A. Irvine
 */
public class A011964 extends A011961 {

  private int mN = 0;

  @Override
  public Z next() {
    return f(10, ++mN);
  }
}
