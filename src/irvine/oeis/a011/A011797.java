package irvine.oeis.a011;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A011797 a(n) = floor(C(n,6)/7).
 * @author Sean A. Irvine
 */
public class A011797 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 6).divide(7);
  }
}
