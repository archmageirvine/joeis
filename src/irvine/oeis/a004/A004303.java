package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A004303 a(n) = binomial(2*n-2,n-1)/n - 2^(n-1) + n.
 * @author Sean A. Irvine
 */
public class A004303 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(2L * (mN - 1), mN - 1).divide(mN).subtract(Z.ONE.shiftLeft(mN - 1)).add(mN);
  }
}

