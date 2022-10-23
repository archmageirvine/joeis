package irvine.oeis.a037;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A037958 a(n) = binomial(n, floor((n-8)/2)).
 * @author Sean A. Irvine
 */
public class A037958 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return ++mN < 8 ? Z.ZERO : Binomial.binomial(mN, (mN - 8) / 2);
  }
}


