package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A006630 From generalized Catalan numbers.
 * @author Sean A. Irvine
 */
public class A006630 extends Sequence0 {

  private long mN = -1;
  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(3 * mN + 6, mN).multiply2().divide(mN + 2);
  }

}

