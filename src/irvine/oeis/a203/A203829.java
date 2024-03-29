package irvine.oeis.a203;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A203829 Number of (n+1) X 3 0..2 arrays with every 2 X 2 subblock having equal diagonal elements or equal antidiagonal elements.
 * @author Georg Fischer
 */
public class A203829 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A203829() {
    super(1, new long[] {0, 225, -54},
      new long[] {1, -9, 2});
  }
}
