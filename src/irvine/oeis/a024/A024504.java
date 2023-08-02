package irvine.oeis.a024;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A024504 a(n) = floor(C(2n,n)/2^(n+1)).
 * @author Sean A. Irvine
 */
public class A024504 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(2L * mN, mN).shiftRight(mN + 1);
  }
}
