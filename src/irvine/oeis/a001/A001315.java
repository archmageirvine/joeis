package irvine.oeis.a001;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001315 a(n) = Sum_{k=0..n} 2^binomial(n,k).
 * @author Sean A. Irvine
 */
public class A001315 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      s = s.add(Z.ONE.shiftLeft(Binomial.binomial(mN, k).intValue()));
    }
    return s;
  }
}
