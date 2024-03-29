package irvine.oeis.a268;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A268264 Number of length-(5+1) 0..n arrays with new repeated values introduced in sequential order starting with zero.
 * @author Georg Fischer
 */
public class A268264 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A268264() {
    super(1, new long[] {0, 33, 42, 398, 143, 107, -2, -2, 1},
      new long[] {1, -7, 21, -35, 35, -21, 7, -1});
  }
}
