package irvine.oeis.a001;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001449 Binomial coefficients binomial(5n,n).
 * @author Sean A. Irvine
 */
public class A001449 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(5 * mN, mN);
  }
}
