package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A082237 n-th roots of the n-th powers pertaining to A082236.
 * @author Sean A. Irvine
 */
public class A082237 extends Sequence1 {

  private final DirectSequence mA = new A082236();
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (int k = 0; k < mN; ++k) {
      prod = prod.multiply(mA.a(mN + k));
    }
    return prod.root(mN);
  }
}
