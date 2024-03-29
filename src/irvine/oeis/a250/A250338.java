package irvine.oeis.a250;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A250338 Number of length 2+5 0..n arrays with every six consecutive terms having the maximum of some three terms equal to the minimum of the remaining three terms.
 * @author Georg Fischer
 */
public class A250338 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A250338() {
    super(1, new long[] {0, 68, 431, 343, -96, -20, -7, 1},
      new long[] {1, -7, 21, -35, 35, -21, 7, -1});
  }
}
