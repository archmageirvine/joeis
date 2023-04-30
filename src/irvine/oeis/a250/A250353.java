package irvine.oeis.a250;
// manually verified, 2023-04-29 (Mathar)

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A250353 Number of length 4 arrays x(i), i=1..4 with x(i) in i..i+n and no value appearing more than 2 times.
 * @author Georg Fischer
 */
public class A250353 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A250353() {
    super(1, new long[] {0, 16, -5, 20, -4, -4, 1}, new long[] {1, -5, 10, -10, 5, -1});
  }
}
