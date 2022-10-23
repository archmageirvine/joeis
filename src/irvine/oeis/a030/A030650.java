package irvine.oeis.a030;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A030650 Dimensions of multiples of minimal representations of complex Lie algebra E_8.
 * @author Sean A. Irvine
 */
public class A030650 extends Sequence1 {

  private static final Z DEN = new Z("298109643686752257360");
  private long mN = 5;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 5)
      .multiply(Binomial.binomial(mN + 18, 18).square())
      .multiply(Binomial.binomial(mN + 14, 10))
      .multiply(Binomial.binomial(mN + 23, 5))
      .multiply(2 * mN + 19)
      .divide(DEN);
  }
}

