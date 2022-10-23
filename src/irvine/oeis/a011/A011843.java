package irvine.oeis.a011;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A011843 a(n) = floor(binomial(n,5)/6).
 * @author Sean A. Irvine
 */
public class A011843 extends Sequence0 {

  private long mN = 0;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 6).divide(mN);
  }
}

