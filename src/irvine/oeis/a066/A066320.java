package irvine.oeis.a066;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066320 Triangle read by rows: T(n, k) = binomial(n, k)*k^k*(n-k)^(n-k-1) k=0..n-1.
 * @author Sean A. Irvine
 */
public class A066320 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return Binomial.binomial(mN, mM).multiply(Z.valueOf(mM).pow(mM)).multiply(Z.valueOf(mN - mM).pow(mN - mM - 1));
  }
}

