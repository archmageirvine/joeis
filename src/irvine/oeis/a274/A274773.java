package irvine.oeis.a274;
// manually floor at 2021-09-01 13:58

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A274773 a(n) = floor(sqrt(2 * n-1) + 1/2) - abs(2 * (n-1) - (floor(sqrt(2 * n-1) + 1/2))^2) + 1.
 * @author Georg Fischer
 */
public class A274773 extends FloorSequence {
  /** Construct the sequence. */
  public A274773() {
    super(1);
  }

  protected Z evalCR(final long n) {
    final Z term = CR.valueOf(2 * mN - 1).sqrt().add(CR.HALF).floor();
    return term.subtract((Z.valueOf(2 * mN - 2).subtract(term.square())).abs()).add(Z.ONE);
  }

}
