package irvine.oeis.a224;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A224143 Number of n X 5 0..1 arrays with rows and antidiagonals unimodal and columns nondecreasing.
 * @author Georg Fischer
 */
public class A224143 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A224143() {
    super(1, new long[] {0, 16, -10, -1, 11, 8, -10, 1, 1},
      new long[] {1, -6, 15, -20, 15, -6, 1});
  }
}
