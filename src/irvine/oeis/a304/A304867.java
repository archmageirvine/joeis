package irvine.oeis.a304;

import irvine.math.z.Z;
import irvine.oeis.a318.A318601;

/**
 * A304867 Number of non-isomorphic hypertrees of weight n.
 * @author Gregory Morse
 */
public class A304867 extends A318601 {
  private int mN = -1;

  /** Construct the sequence. */
  public A304867() {
    setOffset(0);
  }

  @Override
  public Z next() {
    if (++mN <= 1) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 1; k <= mN / 2; ++k) {
      sum = sum.add(row(mN + 1 - k).coeff(k).toZ());
    }
    return sum;
  }
}
