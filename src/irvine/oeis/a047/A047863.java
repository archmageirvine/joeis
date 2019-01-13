package irvine.oeis.a047;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A047863.
 * @author Sean A. Irvine
 */
public class A047863 implements Sequence {

  protected int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      s = s.add(Binomial.binomial(mN, k).shiftLeft(k * (mN - k)));
    }
    return s;
  }
}
