package irvine.oeis.a024;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A024498 a(n) = [ C(2n,n)/n ].
 * @author Sean A. Irvine
 */
public class A024498 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(2L * mN, mN).divide(mN);
  }
}
