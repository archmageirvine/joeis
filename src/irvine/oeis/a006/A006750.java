package irvine.oeis.a006;

import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006750.
 * @author Sean A. Irvine
 */
public class A006750 implements Sequence {

  private int mN = 1;

  @Override
  public Z next() {
    ++mN;
    return new Q(Binomial.binomial(4L * mN, 2L * mN), Z.ONE.shiftLeft(4 * mN)).num()
      .multiply(4L * mN + 1)
      .multiply(2L * mN - 2)
      .multiply(mN)
      .multiply(22)
      .divide(2L * mN + 7)
      .divide(2L * mN + 5)
      .divide(2L * mN + 3)
      .divide(2L * mN + 1);
  }
}
