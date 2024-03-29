package irvine.oeis.a254;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A254705 Number of length 7+4 0..n arrays with every five consecutive terms having the maximum of some two terms equal to the minimum of the remaining three terms.
 * @author Georg Fischer
 */
public class A254705 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A254705() {
    super(1, new long[] {0, 334, 6100, 17962, -2133, -6817, -614, 56, -9, 1},
      new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9, -1});
  }
}
