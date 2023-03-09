package irvine.oeis.a061;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a003.A003422;

/**
 * A061834 a(n) = binomial(n,2) * !n.
 * @author Sean A. Irvine
 */
public class A061834 extends A003422 {

  @Override
  public Z next() {
    return super.next().multiply(Binomial.binomial(mN + 1, 2));
  }
}

