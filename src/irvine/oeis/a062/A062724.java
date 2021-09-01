package irvine.oeis.a062;
// manually floor at 2021-08-30 14:32

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;
/**
 * A062724 a(n) = floor(tau^n) + 1, where tau = (1 + sqrt(5))/2.
 * @author Georg Fischer
 */
public class A062724 extends FloorSequence {
  /** Construct the sequence. */
  public A062724() {
    super(0);
  }

  protected Z evalCR(final long n) {
    return CR.PHI.pow(n).floor().add(Z.ONE);
  }

}
