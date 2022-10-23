package irvine.oeis.a011;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A011850 a(n) = floor(binomial(n,4)/4).
 * @author Sean A. Irvine
 */
public class A011850 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 4).divide(4);
  }
}
