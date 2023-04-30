package irvine.oeis.a259;
// manually verified, 2023-04-29 (Mathar)

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A259216 Number of (n+1) X (2+1) 0..1 arrays with each 2 X 2 subblock having clockwise pattern 0000 0011 or 0101.
 * @author Georg Fischer
 */
public class A259216 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A259216() {
    super(1, new long[] {0, 13, -16, -16}, new long[] {1, -3, 1, 2});
  }
}
