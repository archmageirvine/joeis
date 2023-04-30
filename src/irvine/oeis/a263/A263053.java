package irvine.oeis.a263;
// manually verified, 2023-04-29 (Howroyd)

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A263053 Number of (n+1) X 2 0..1 arrays with each row and column not divisible by 3, read as a binary number with top and left being the most significant bits.
 * @author Georg Fischer
 */
public class A263053 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A263053() {
    super(1, new long[] {0, 2}, new long[] {1, -1, -4, 4});
  }
}
