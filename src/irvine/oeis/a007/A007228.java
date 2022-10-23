package irvine.oeis.a007;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A007228 a(n) = 3*binomial(4*n,n)/(n+1).
 * @author Sean A. Irvine
 */
public class A007228 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(4 * mN, mN).multiply(3).divide(mN + 1);
  }
}
