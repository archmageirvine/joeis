package irvine.oeis.a027;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027466 Triangle whose <code>(i,j)-th</code> entry is <code>binomial(i,j)*7^(i-j)</code>.
 * @author Sean A. Irvine
 */
public class A027466 implements Sequence {

  private int mN = -1;
  private int mM = 0;
  private Z mT = null;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
      mT = Z.SEVEN.pow(mN);
    } else {
      mT = mT.divide(7);
    }
    return Binomial.binomial(mN, mM).multiply(mT);
  }
}
