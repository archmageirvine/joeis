package irvine.oeis.a110;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A110622 n^2 followed by n followed by n^3 followed by n^4.
 * @author Georg Fischer
 */
public class A110622 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A110622() {
    super(1, new long[] {0, -1, -1, -1, -1, 1, 3, -3, -11, 1, -3, 3, -11, -1, 1, 1, 
      -1},
      new long[] {-1, 0, 0, 0, 5, 0, 0, 0, -10, 0, 0, 0, 10, 0, 0, 0, -5, 0, 
      0, 0, 1});
  }
}
