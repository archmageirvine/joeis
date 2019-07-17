package irvine.oeis.a024;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024503 <code>a(n) = floor(binomial(2*n,n)/3^n)</code>.
 * @author Sean A. Irvine
 */
public class A024503 implements Sequence {

  private int mN = -1;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mT = mT.multiply(3);
    }
    return Binomial.binomial(2 * mN, mN).divide(mT);
  }
}
