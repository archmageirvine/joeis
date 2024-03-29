package irvine.oeis.a250;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A250375 Number of length 2+6 0..n arrays with every seven consecutive terms having the maximum of some three terms equal to the minimum of the remaining four terms.
 * @author Georg Fischer
 */
public class A250375 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A250375() {
    super(1, new long[] {0, 151, 1888, 4026, 939, -417, -114, 8, -1},
      new long[] {1, -8, 28, -56, 70, -56, 28, -8, 1});
  }
}
