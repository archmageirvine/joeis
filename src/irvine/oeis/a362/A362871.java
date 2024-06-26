package irvine.oeis.a362;
// Generated by gen_seq4.pl 2024-06-26/sintraf at 2024-06-26 17:12

import irvine.math.function.Functions;
import irvine.oeis.a000.A000400;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A362871 Leading digit of 6^n.
 * @author Georg Fischer
 */
public class A362871 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A362871() {
    super(0, (term, n) -> Functions.LEADING_DIGIT.z(10, term), new A000400());
  }
}
