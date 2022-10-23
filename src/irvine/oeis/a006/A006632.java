package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006632 a(n) = 3*binomial(4*n-1,n-1)/(4*n-1).
 * @author Sean A. Irvine
 */
public class A006632 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(4 * mN - 2, mN - 1).divide(mN);
  }
}

