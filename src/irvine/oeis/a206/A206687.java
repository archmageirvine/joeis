package irvine.oeis.a206;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A206687 Number of n X 2 0..3 arrays with no element equal to another within two positions in the same row or column, and new values 0..3 introduced in row major order.
 * @author Georg Fischer
 */
public class A206687 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A206687() {
    super(1, new long[] {0, 1, 2, -1, -2},
      new long[] {1, -2, -4});
  }
}
