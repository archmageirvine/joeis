package irvine.oeis.a249;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A249845 Number of length 1+4 0..n arrays with no five consecutive terms having the maximum of any two terms equal to the minimum of the remaining three terms.
 * @author Georg Fischer
 */
public class A249845 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A249845() {
    super(1, new long[] {0, 10, 50, 50, 10},
      new long[] {1, -6, 15, -20, 15, -6, 1});
  }
}
