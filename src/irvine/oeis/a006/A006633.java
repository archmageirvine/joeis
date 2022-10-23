package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A006633 From generalized Catalan numbers.
 * @author Sean A. Irvine
 */
public class A006633 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(4 * mN + 5, mN).multiply2().divide(mN + 2);
  }
}

