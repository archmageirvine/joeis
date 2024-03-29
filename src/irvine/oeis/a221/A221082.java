package irvine.oeis.a221;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A221082 Number of n X 3 arrays of occupancy after each element moves to some horizontal or antidiagonal neighbor.
 * @author Georg Fischer
 */
public class A221082 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A221082() {
    super(1, new long[] {0, 2},
      new long[] {1, -12, 9});
  }
}
