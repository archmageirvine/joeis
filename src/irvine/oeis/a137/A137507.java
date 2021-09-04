package irvine.oeis.a137;
// manually floor at 2021-09-01 16:25

import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A137507 a(n) = 100^[n/10] + 2*n*10^[n/10]: inspired by Engel expansion of Pi.
 * @author Georg Fischer
 */
public class A137507 extends FloorSequence {
  /** Construct the sequence. */
  public A137507() {
    super(0);
  }

  @Override
  protected Z evalCR(final long n) {
    final long n10 = mN / 10;
    return Z.valueOf(100).pow(n10).add(Z.valueOf(2 * n).multiply(Z.TEN.pow(n10)));
  }

}
