package irvine.oeis.a001;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001315 Sum <code>2^C(n,k), k = 0..n</code>.
 * @author Sean A. Irvine
 */
public class A001315 implements Sequence {

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
