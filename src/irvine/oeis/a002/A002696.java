package irvine.oeis.a002;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;


/**
 * A002696 Binomial coefficients C(2n,n-3).
 * @author Sean A. Irvine
 */
public class A002696 extends Sequence3 {

  private long mN = 2;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(2 * mN, mN - 3);
  }
}
