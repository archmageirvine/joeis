package irvine.oeis.a027;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027467 Triangle whose <code>(n,k)-th</code> entry is <code>binomial(n,k)*15^(n-k)</code>.
 * @author Sean A. Irvine
 */
public class A027467 implements Sequence {

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
