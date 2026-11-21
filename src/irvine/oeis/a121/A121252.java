package irvine.oeis.a121;

import irvine.math.z.Z;
import irvine.oeis.a054.A054547;

/**
 * A121252 Number of labeled digraphs without isolated vertices and with n arcs.
 * @author Gregory Morse
 */
public class A121252 extends A054547 {
  /** Construct the sequence. */
  public A121252() {
    setOffset(0);
  }

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 1; k <= 2 * mN; ++k) {
      sum = sum.add(count(k, mN));
    }
    return sum;
  }
}
