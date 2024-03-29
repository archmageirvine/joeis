package irvine.oeis.a024;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A024491 a(n) = (1/(4n-1))*C(4n,2n).
 * @author Sean A. Irvine
 */
public class A024491 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(4L * mN, 2L * mN).divide(4L * mN - 1);
  }
}
