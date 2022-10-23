package irvine.oeis.a051;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A051053 a(n) = binomial(n, floor(n/6)).
 * @author Sean A. Irvine
 */
public class A051053 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, mN / 6);
  }
}
