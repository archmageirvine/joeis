package irvine.oeis.a011;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A011852 a(n) = floor(binomial(n,6)/6).
 * @author Sean A. Irvine
 */
public class A011852 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 6).divide(6);
  }
}
