package irvine.oeis.a065;

import irvine.math.z.Z;

/**
 * A065812 a(n) = A065811(n)/3.
 * @author Sean A. Irvine
 */
public class A065812 extends A065811 {

  @Override
  public Z next() {
    return super.next().divide(3);
  }
}
