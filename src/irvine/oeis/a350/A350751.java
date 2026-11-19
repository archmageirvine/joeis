package irvine.oeis.a350;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A350751 Number of unlabeled strongly connected oriented graphs with n arcs.
 * @author Gregory Morse
 */
public class A350751 extends A350750 {
  private int mArcs = -1;

  /** Construct the sequence. */
  public A350751() {
    super(0);
  }

  @Override
  public Z next() {
    if (++mArcs == 0) {
      return Z.ONE;
    }
    final Polynomial<Polynomial<Q>> table = counts(mArcs, mArcs);
    Z sum = Z.ZERO;
    for (int k = 2; k <= mArcs; ++k) {
      sum = sum.add(table.coeff(k).coeff(mArcs).toZ());
    }
    return sum;
  }
}
