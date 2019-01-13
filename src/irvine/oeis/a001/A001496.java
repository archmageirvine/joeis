package irvine.oeis.a001;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001496.
 * @author Sean A. Irvine
 */
public class A001496 implements Sequence {

  private long mN = 2;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(mN, 3)
      .add(Binomial.binomial(mN + 1, 5).multiply(20))
      .add(Binomial.binomial(mN + 2, 7).multiply(152))
      .add(Binomial.binomial(mN + 3, 9).multiply(352));
  }
}
