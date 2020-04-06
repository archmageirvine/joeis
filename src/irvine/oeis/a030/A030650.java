package irvine.oeis.a030;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030650 Dimensions of multiples of minimal representations of complex Lie algebra <code>E_8</code>.
 * @author Sean A. Irvine
 */
public class A030650 implements Sequence {

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

