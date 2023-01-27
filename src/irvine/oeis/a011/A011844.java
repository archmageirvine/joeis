package irvine.oeis.a011;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A011844 a(n) = floor(C(n,7)/8).
 * @author Sean A. Irvine
 */
public class A011844 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 7).divide(8);
  }
}

