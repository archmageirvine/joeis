package irvine.oeis.a037;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A037956 a(n) = binomial(n, floor((n-4)/2)).
 * @author Sean A. Irvine
 */
public class A037956 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return ++mN < 4 ? Z.ZERO : Binomial.binomial(mN, (mN - 4) / 2);
  }
}


