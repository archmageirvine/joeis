package irvine.oeis.a007;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A007290 a(n) = 2*binomial(n,3).
 * @author Sean A. Irvine
 */
public class A007290 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 3).multiply2();
  }
}
