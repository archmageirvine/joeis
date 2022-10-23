package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A006095 Gaussian binomial coefficient [n,2] for q=2.
 * @author Sean A. Irvine
 */
public class A006095 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.ONE.shiftLeft(mN).subtract(1).multiply(Z.ONE.shiftLeft(mN - 1).subtract(1)).divide(3);
  }
}

