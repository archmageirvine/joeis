package irvine.oeis.a187;
// manually verified, 2023-04-29

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A187163 Number of 2-step self-avoiding walks on an n X n X n cube summed over all starting positions.
 * @author Georg Fischer
 */
public class A187163 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A187163() {
    super(1, new long[] {0, 0, 24, 12}, new long[] {1, -4, 6, -4, 1});
  }
}
