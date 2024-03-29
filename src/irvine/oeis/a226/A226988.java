package irvine.oeis.a226;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A226988 Number of n X 2 0..4 arrays of sums of 2 X 2 subblocks of some (n+1) X 3 binary array with rows and columns of the latter in lexicographically nondecreasing order.
 * @author Georg Fischer
 */
public class A226988 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A226988() {
    super(1, new long[] {0, 10, -38, 64, -31, -67, 148, -137, 56, 12, -26, 12, -2},
      new long[] {1, -8, 28, -56, 70, -56, 28, -8, 1});
  }
}
