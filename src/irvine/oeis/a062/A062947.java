package irvine.oeis.a062;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A062947 a(n) = binomial(n,floor(n/7)).
 * @author Sean A. Irvine
 */
public class A062947 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, mN / 7);
  }
}

