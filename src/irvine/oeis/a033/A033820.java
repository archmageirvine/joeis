package irvine.oeis.a033;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033820 Triangle read by rows: <code>T(k,j) = ((2*j+1)/(k+1))*binomial(2*j,j)*binomial(2*k-2*j,k-j)</code>.
 * @author Sean A. Irvine
 */
public class A033820 implements Sequence {

  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Binomial.binomial(2 * mM, mM)
      .multiply(Binomial.binomial(2 * mN - 2 * mM, mN - mM))
      .multiply(2 * mM + 1)
      .divide(mN + 1);
  }
}
