package irvine.oeis.a037;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A037953 a(n) = binomial(n, floor((n-5)/2)).
 * @author Sean A. Irvine
 */
public class A037953 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return ++mN < 5 ? Z.ZERO : Binomial.binomial(mN, (mN - 5) / 2);
  }
}


