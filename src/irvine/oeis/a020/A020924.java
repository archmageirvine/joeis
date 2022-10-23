package irvine.oeis.a020;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A020924 Expansion of 1/(1-4*x)^(13/2).
 * @author Sean A. Irvine
 */
public class A020924 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(2 * ++mN, mN)
      .multiply(2 * mN + 11)
      .multiply(2 * mN + 9)
      .multiply(2 * mN + 7)
      .multiply(2 * mN + 5)
      .multiply(2 * mN + 3)
      .multiply(2 * mN + 1)
      .divide(10395);
  }
}
