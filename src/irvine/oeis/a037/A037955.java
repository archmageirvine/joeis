package irvine.oeis.a037;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A037955 a(n) = binomial(n, floor(n/2)-1).
 * @author Sean A. Irvine
 */
public class A037955 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, mN / 2 - 1);
  }
}


