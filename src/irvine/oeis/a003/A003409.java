package irvine.oeis.a003;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A003409 a(n) = 3*binomial(2n-1,n).
 * @author Sean A. Irvine
 */
public class A003409 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(2 * mN - 1, mN).multiply(3);
  }
}
