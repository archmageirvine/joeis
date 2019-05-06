package irvine.oeis.a020;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020926 Expansion of <code>1/(1-4*x)^(15/2)</code>.
 * @author Sean A. Irvine
 */
public class A020926 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(2 * ++mN, mN)
      .multiply(2 * mN + 13)
      .multiply(2 * mN + 11)
      .multiply(2 * mN + 9)
      .multiply(2 * mN + 7)
      .multiply(2 * mN + 5)
      .multiply(2 * mN + 3)
      .multiply(2 * mN + 1)
      .divide(135135);
  }
}
