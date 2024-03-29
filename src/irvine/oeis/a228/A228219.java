package irvine.oeis.a228;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A228219 Number of second differences of arrays of length 4 of numbers in 0..n.
 * @author Georg Fischer
 */
public class A228219 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A228219() {
    super(1, new long[] {0, 15, 4, 1},
      new long[] {1, -3, 3, -1});
  }
}
