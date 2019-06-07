package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004303 <code>a(n) = C(2n-2,n-1)/n - 2^(n-1) + n</code>.
 * @author Sean A. Irvine
 */
public class A004303 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(2L * (mN - 1), mN - 1).divide(mN).subtract(Z.ONE.shiftLeft(mN - 1)).add(mN);
  }
}

