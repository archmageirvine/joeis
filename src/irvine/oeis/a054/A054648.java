package irvine.oeis.a054;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054647.
 * @author Sean A. Irvine
 */
public class A054648 implements Sequence {

  private long mN = 5;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 6).multiply(360)
      .add(Binomial.binomial(mN, 7).multiply(10710))
      .add(Binomial.binomial(mN, 8).multiply(42000))
      .add(Binomial.binomial(mN, 9).multiply(41580))
      .add(Binomial.binomial(mN, 10).multiply(12600));
  }
}

