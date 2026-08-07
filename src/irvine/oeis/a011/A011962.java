package irvine.oeis.a011;

import irvine.math.z.Z;

/**
 * A011962 Number of ferrites M_6Y_n that repeat after 6n+30 layers.
 * @author Sean A. Irvine
 */
public class A011962 extends A011961 {

  private int mN = 0;

  @Override
  public Z next() {
    return f(6, ++mN);
  }
}
