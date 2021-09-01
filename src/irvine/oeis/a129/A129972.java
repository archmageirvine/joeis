package irvine.oeis.a129;
// manually floor at 2021-09-01 16:25

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A129972 a(n) = 2 * floor(log_2(n)) + 1.
 * @author Georg Fischer
 */
public class A129972 extends FloorSequence {
  /** Construct the sequence */
  public A129972() {
    super(1);
  }

  @Override
  protected Z evalCR(final long n) {
    return Z.TWO.multiply(CR.valueOf(n).log().divide(CR.TWO.log()).floor()).add(Z.ONE);
  }

}
