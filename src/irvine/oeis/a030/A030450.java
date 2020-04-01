package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030450.
 * @author Sean A. Irvine
 */
public class A030450 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (int k = 1; k <= mN; ++k) {
      prod = prod.multiply(Z.valueOf(mN - k + 1).pow(Z.ONE.shiftLeft(k)));
    }
    return prod;
  }
}
