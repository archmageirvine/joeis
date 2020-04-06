package irvine.oeis.a030;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030648 Dimensions of multiples of minimal representation of complex Lie algebra <code>E6</code>.
 * @author Sean A. Irvine
 */
public class A030648 implements Sequence {

  private long mN = 2;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 3)
      .multiply(Binomial.binomial(mN + 5, 5).square())
      .multiply(Binomial.binomial(mN + 8, 3))
      .divide(517440);
  }
}
