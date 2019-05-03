package irvine.oeis.a162;

import irvine.math.z.Z;

/**
 * A162789 <code>a(n) = A162529(n)/9</code>.
 * @author Sean A. Irvine
 */
public class A162789 extends A162529 {

  @Override
  public Z next() {
    return super.next().divide(9);
  }
}
