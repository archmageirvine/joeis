package irvine.oeis.a000;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000888 a(n) = (2*n)!^2 / ((n+1)!*n!^3).
 * @author Sean A. Irvine
 */
public class A000888 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(2 * mN, mN).square().divide(mN + 1);
  }
}

