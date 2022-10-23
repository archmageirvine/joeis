package irvine.oeis.a002;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002299 Binomial coefficients C(2*n+5,5).
 * @author Sean A. Irvine
 */
public class A002299 extends Sequence0 {

  private int mN = 3;

  @Override
  public Z next() {
    mN += 2;
    return Binomial.binomial(mN, 5);
  }
}
