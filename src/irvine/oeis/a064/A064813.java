package irvine.oeis.a064;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A064813 a(n) = binomial(composite(n), n), where composite = A002808, composite numbers.
 * @author Sean A. Irvine
 */
public class A064813 extends A002808 {

  private int mN = 0;

  @Override
  public Z next() {
    return Binomial.binomial(super.next().longValueExact(), ++mN);
  }
}

