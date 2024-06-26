package irvine.oeis.a166;
// Generated by gen_seq4.pl 2024-06-23/sintrif at 2024-06-23 23:33

import irvine.math.function.Functions;
import irvine.oeis.a000.A000124;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A166314 Number of 1's in binary expansion of A000124(n).
 * @author Georg Fischer
 */
public class A166314 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A166314() {
    super(0, (term, n) -> Functions.DIGIT_SUM.z(2, term), "", new A000124());
  }
}
