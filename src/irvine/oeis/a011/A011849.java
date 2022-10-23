package irvine.oeis.a011;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A011849 a(n) = floor(binomial(n,3)/3).
 * @author Sean A. Irvine
 */
public class A011849 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 3).divide(3);
  }
}
