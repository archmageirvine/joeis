package irvine.oeis.a000;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000588 a(n) = 7*binomial(2n,n-3)/(n+4).
 * @author Sean A. Irvine
 */
public class A000588 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(2 * mN, mN - 3).multiply(7).divide(mN + 4);
  }
}

