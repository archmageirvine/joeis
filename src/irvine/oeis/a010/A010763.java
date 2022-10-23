package irvine.oeis.a010;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A010763 a(n) = binomial(2n+1, n+1) - 1.
 * @author Sean A. Irvine
 */
public class A010763 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(2 * mN + 1, mN + 1).subtract(1);
  }
}
