package irvine.oeis.a011;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A011856 a(n) = floor(binomial(n,10)/10).
 * @author Sean A. Irvine
 */
public class A011856 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 10).divide(10);
  }
}
