package irvine.oeis.a011;

import irvine.math.z.Z;

/**
 * A011960 Number of ferrites M_2Y_n that repeat after 6n+10 layers.
 * @author Sean A. Irvine
 */
public class A011960 extends A011961 {

  private int mN = 0;

  @Override
  public Z next() {
    return f(2, ++mN);
  }
}
