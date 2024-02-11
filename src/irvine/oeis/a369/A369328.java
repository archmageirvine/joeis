package irvine.oeis.a369;
// manually robots/lingf at 2024-02-11 16:04

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A369328 Antidiagonal sums of A369326.
 * @author Georg Fischer
 */
public class A369328 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A369328() {
    super(0, "[1, -4, 5, -3]", "[1, -5, 8, -5]");
    super.next();
  }
}
