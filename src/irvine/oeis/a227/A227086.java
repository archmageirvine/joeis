package irvine.oeis.a227;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A227086 Number of n X 3 binary arrays indicating whether each 2 X 2 subblock of a larger binary array has lexicographically increasing rows and columns, for some larger (n+1) X 4 binary array with rows and columns of the latter in lexicographically nondecreasing order.
 * @author Georg Fischer
 */
public class A227086 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A227086() {
    super(1, new long[] {0, 7, -55, 213, -512, 837, -964, 794, -468, 197, -58, 11, -1},
      new long[] {1, -12, 66, -220, 495, -792, 924, -792, 495, -220, 66, -12, 1});
  }
}
