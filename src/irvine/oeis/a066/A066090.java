package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066090 a(n) = binomial(sigma(n), n).
 * @author Sean A. Irvine
 */
public class A066090 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Binomial.binomial(Jaguar.factor(++mN).sigma().longValueExact(), mN);
  }
}
