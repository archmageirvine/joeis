package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071226 n-th power of the product of next n natural numbers.
 * @author Sean A. Irvine
 */
public class A071226 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (long k = 0; k < mN; ++k) {
      prod = prod.multiply(++mM);
    }
    return prod.pow(mN);
  }
}
