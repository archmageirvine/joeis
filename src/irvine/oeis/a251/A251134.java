package irvine.oeis.a251;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A251134 Number of (n+1) X (5+1) 0..2 arrays with no 2 X 2 subblock having the sum of its diagonal elements greater than the maximum of its antidiagonal elements.
 * @author Georg Fischer
 */
public class A251134 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A251134() {
    super(1, new long[] {0, 2129, -7988, 7011, 7381, -16776, 9606, -883, -571, 21, 2},
      new long[] {1, -6, 13, -10, -5, 14, -9, 2});
  }
}
