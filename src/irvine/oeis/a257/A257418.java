package irvine.oeis.a257;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A257418 Number of pieces after a sheet of paper is folded n times and cut diagonally.
 * @author Georg Fischer
 */
public class A257418 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A257418() {
    super(0, new long[] {-2, 3, 4, -5, 1, -2},
      new long[] {-1, 3, 0, -6, 4});
  }
}
