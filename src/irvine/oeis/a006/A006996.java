package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A006996 C(2n,n) mod 3.
 * @author Sean A. Irvine
 */
public class A006996 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(Binomial.binomial(2 * mN, mN, 3));
  }
}
