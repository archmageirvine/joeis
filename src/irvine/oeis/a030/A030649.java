package irvine.oeis.a030;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A030649 Dimensions of multiples of minimal representation of complex Lie algebra E7.
 * @author Sean A. Irvine
 */
public class A030649 extends Sequence0 {

  private long mN = 3;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 4)
      .multiply(Binomial.binomial(mN + 9, 9).square())
      .multiply(Binomial.binomial(mN + 13, 4))
      .multiply(mN + 5)
      .divide(10950439500L);
  }
}

