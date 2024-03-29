package irvine.oeis.a036;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A036909 a(n) = (2/3) * 4^n * binomial(3*n, n).
 * @author Sean A. Irvine
 */
public class A036909 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Binomial.binomial(3L * ++mN, mN).shiftLeft(2L * mN + 1).divide(3);
  }
}
