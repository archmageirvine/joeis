package irvine.oeis.a250;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A250062 Number of length 3+6 0..n arrays with no seven consecutive terms having the maximum of any two terms equal to the minimum of the remaining five terms.
 * @author Georg Fischer
 */
public class A250062 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A250062() {
    super(1, new long[] {0, 21, 2082, 28053, 105494, 142519, 72798, 11647, 266},
      new long[] {1, -10, 45, -120, 210, -252, 210, -120, 45, -10, 1});
  }
}
