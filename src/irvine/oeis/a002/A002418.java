package irvine.oeis.a002;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002418 4-dimensional figurate numbers: a(n) = (5*n-1)*binomial(n+2,3)/4.
 * @author Sean A. Irvine
 */
public class A002418 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(mN + 2, 3).multiply(5 * mN - 1).divide(4);
  }
}
