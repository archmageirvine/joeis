package irvine.oeis.a024;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A024500 a(n) = [ C(2n,n)/n^2 ].
 * @author Sean A. Irvine
 */
public class A024500 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(2L * mN, mN).divide(mN).divide(mN);
  }
}
