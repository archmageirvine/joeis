package irvine.oeis.a003;

import irvine.math.z.Binomial;
import irvine.math.z.Z;

/**
 * A003162.
 * @author Sean A. Irvine
 */
public class A003162 extends A003161 {

  @Override
  public Z next() {
    return super.next().divide(Binomial.binomial(mN, mN / 2));
  }
}
