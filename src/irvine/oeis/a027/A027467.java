package irvine.oeis.a027;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A027467 Triangle whose (n,k)-th entry is 15^(n-k)*binomial(n,k).
 * @author Sean A. Irvine
 */
public class A027467 extends Sequence0 {

  private static final Z Z15 = Z.valueOf(15);
  private int mN = -1;
  private int mM = 0;
  private Z mT = null;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
      mT = Z15.pow(mN);
    } else {
      mT = mT.divide(15);
    }
    return Binomial.binomial(mN, mM).multiply(mT);
  }
}
