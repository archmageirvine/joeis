package irvine.oeis.a061;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A061356 Triangle read by rows: T(n, k) is the number of labeled trees on n nodes with maximal node degree k (0 &lt; k &lt; n).
 * @author Sean A. Irvine
 */
public class A061356 extends Sequence2 {

  private long mN = 1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 1;
    }
    return Binomial.binomial(mN - 2, mM - 1).multiply(Z.valueOf(mN - 1).pow(mN - mM - 1));
  }
}

