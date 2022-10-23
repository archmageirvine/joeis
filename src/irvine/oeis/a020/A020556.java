package irvine.oeis.a020;

import irvine.math.z.BellNumbers;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A020556 Number of oriented multigraphs on n labeled arcs (without loops).
 * @author Sean A. Irvine
 */
public class A020556 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.signedAdd((k & 1) == 0, Binomial.binomial(mN, k).multiply(BellNumbers.bell(2 * mN - k)));
    }
    return sum;
  }
}
