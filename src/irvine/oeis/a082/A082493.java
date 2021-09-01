package irvine.oeis.a082;
// manually floor at 2021-08-28 19:09

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;
/**
 * A082493 a(n) = n*ceiling(2^n/n) - 2^n.
 * @author Georg Fischer
 */
public class A082493 extends FloorSequence {
  /** Construct the sequence. */
  public A082493() {
    super(1);
  }

  protected Z evalCR(final long n) {
    final Z n2 = Z.ONE.shiftLeft((int) n);
    return CR.valueOf(n2).divide(CR.valueOf(n)).ceil().multiply(n).subtract(n2);
  }

}
