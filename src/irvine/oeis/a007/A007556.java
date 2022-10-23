package irvine.oeis.a007;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A007556 Number of 8-ary trees with n vertices.
 * @author Sean A. Irvine
 */
public class A007556 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(8 * ++mN, mN).divide(7 * mN + 1);
  }
}
