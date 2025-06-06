package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.a076.A076803;

/**
 * A077691 a(n) = A076803(n)/n.
 * @author Sean A. Irvine
 */
public class A077691 extends A076803 {

  @Override
  public Z next() {
    return super.next().divide(mN);
  }
}
