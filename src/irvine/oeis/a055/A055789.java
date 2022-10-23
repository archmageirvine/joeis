package irvine.oeis.a055;

import irvine.math.cr.CR;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A055789 a(n) = binomial(n, round(sqrt(n))).
 * @author Sean A. Irvine
 */
public class A055789 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, CR.valueOf(mN).sqrt().round().longValue());
  }
}
