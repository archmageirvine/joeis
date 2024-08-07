package irvine.oeis.a373;
// Generated by gen_seq4.pl 2024-07-20/sintrif at 2024-07-20 00:09

import irvine.oeis.a061.A061398;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A373198 Number of squarefree numbers from prime(n) to prime(n+1) - 1.
 * @author Georg Fischer
 */
public class A373198 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A373198() {
    super(1, (term, n) -> term.add(1), "", new A061398());
  }
}
