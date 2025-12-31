package irvine.oeis.a082;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A082904 Triangle read by rows: Pascal's triangle restricted to binomial(n, d) where d is a divisor of n.
 * @author Sean A. Irvine
 */
public class A082904 extends Sequence0 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    while (true) {
      if (++mM > mN) {
        ++mN;
        mM = 1;
      }
      if (mN % mM == 0) {
        return Binomial.binomial(mN, mM);
      }
    }
  }
}
