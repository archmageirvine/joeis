package irvine.oeis.a233;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A233211 Number of n X 2 0..5 arrays with no element x(i,j) adjacent to value 5-x(i,j) horizontally or antidiagonally, top left element zero, and 1 appearing before 2 3 and 4, and 2 appearing before 3 in row major order.
 * @author Georg Fischer
 */
public class A233211 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A233211() {
    super(1, new long[] {0, 2, -47, 165},
      new long[] {1, -35, 259, -225});
  }
}
