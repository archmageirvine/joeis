package irvine.oeis.a249;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A249963 Number of length 3+5 0..n arrays with no six consecutive terms having the maximum of any two terms equal to the minimum of the remaining four terms.
 * @author Georg Fischer
 */
public class A249963 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A249963() {
    super(1, new long[] {0, 15, 762, 6561, 15932, 13281, 3594, 175},
      new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9, -1});
  }
}
