package irvine.oeis.a232;
// manually floor at 2021-09-01 13:58

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A232423 a(n) = ceiling(sqrt(n^4 - n^3 - n^2 + n + 1))^2 - (n^4 - n^3 - n^2 + n + 1).
 * @author Georg Fischer
 */
public class A232423 extends FloorSequence {
  /** Construct the sequence */
  public A232423() {
    super(0);
  }

  @Override
  protected Z evalCR(final long n) {
    final Z nz = Z.valueOf(n);
    final Z sum = nz.pow(4).subtract(nz.pow(3)).subtract(nz.square()).add(n + 1);
    return CR.valueOf(sum).sqrt().ceil(1000).square().subtract(sum);
  }

}
