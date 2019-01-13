package irvine.oeis.a000;

import irvine.math.z.Binomial;
import irvine.math.z.Z;

/**
 * A000449.
 * @author Sean A. Irvine
 */
public class A000449 extends A000166 {

  @Override
  public Z next() {
    return super.next().multiply(Binomial.binomial(mN + 3, 3));
  }
}

