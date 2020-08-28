package irvine.oeis.a034;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a002.A002311;

/**
 * A034404 Values of C(n,3) which can be written as C(x,3) + C(y,3).
 * @author Sean A. Irvine
 */
public class A034404 extends A002311 {

  @Override
  public Z next() {
    return Binomial.binomial(super.next().add(2), Z.THREE);
  }
}
