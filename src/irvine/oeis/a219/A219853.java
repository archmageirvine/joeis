package irvine.oeis.a219;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A219853 Number of 2 X n arrays of the minimum value of corresponding elements and their horizontal or antidiagonal neighbors in a random, but sorted with lexicographically nondecreasing rows and nonincreasing columns, 0..2 2 X n array.
 * @author Georg Fischer
 */
public class A219853 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A219853() {
    super(1, new long[] {0, 6, -11, 14, -3, 1, 0, 2},
      new long[] {1, -3, 3, -1});
  }
}
