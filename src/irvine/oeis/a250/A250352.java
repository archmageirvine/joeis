package irvine.oeis.a250;
// manually verified, 2023-04-29 (Mathar)

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A250352 Number of length 3 arrays x(i), i=1..3 with x(i) in i..i+n and no value appearing more than 2 times.
 * @author Georg Fischer
 */
public class A250352 extends GeneratingFunctionSequence {


  /** Construct the sequence. */
  public A250352() {
    super(1, new long[] {0, 8, -6, 6, -2}, new long[] {1, -4, 6, -4, 1});
  }
}
