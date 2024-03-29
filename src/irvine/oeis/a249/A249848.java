package irvine.oeis.a249;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A249848 Number of length 4+4 0..n arrays with no five consecutive terms having the maximum of any two terms equal to the minimum of the remaining three terms.
 * @author Georg Fischer
 */
public class A249848 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A249848() {
    super(1, new long[] {0, 10, 563, 5535, 15390, 14224, 4287, 311},
      new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9, -1});
  }
}
