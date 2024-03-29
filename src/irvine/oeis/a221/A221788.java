package irvine.oeis.a221;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A221788 Number of 3 X n arrays of occupancy after each element moves to some horizontal or antidiagonal neighbor, without 2-loops or left turns.
 * @author Georg Fischer
 */
public class A221788 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A221788() {
    super(1, new long[] {0, 0, 0, 0, 5, -16, 20},
      new long[] {1, -8, 14, -8, 1});
  }
}
