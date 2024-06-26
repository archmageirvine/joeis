package irvine.oeis.a080;
// Generated by gen_seq4.pl 2024-06-23/sintrif at 2024-06-23 23:33

import irvine.math.function.Functions;
import irvine.oeis.a000.A000984;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A080397 Largest squarefree number dividing central binomial coefficient A000984(n).
 * @author Georg Fischer
 */
public class A080397 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A080397() {
    super(0, (term, n) -> Functions.SQUARE_FREE_KERNEL.z(term), "", new A000984());
  }
}
