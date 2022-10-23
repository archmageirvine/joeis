package irvine.oeis.a030;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A030648 Dimensions of multiples of minimal representation of complex Lie algebra E6.
 * @author Sean A. Irvine
 */
public class A030648 extends Sequence0 {

  private long mN = 2;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 3)
      .multiply(Binomial.binomial(mN + 5, 5).square())
      .multiply(Binomial.binomial(mN + 8, 3))
      .divide(517440);
  }
}
