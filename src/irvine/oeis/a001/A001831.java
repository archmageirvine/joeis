package irvine.oeis.a001;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001831.
 * @author Sean A. Irvine
 */
public class A001831 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      s = s.add(Binomial.binomial(mN, k).multiply(Z.ONE.shiftLeft(k).subtract(1).pow(mN - k)));
    }
    return s;
  }
}
