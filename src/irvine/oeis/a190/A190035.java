package irvine.oeis.a190;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A190035 Number of nondecreasing arrangements of n+2 numbers in 0..3 with the last equal to 3 and each after the second equal to the sum of one or two of the preceding three.
 * @author Georg Fischer
 */
public class A190035 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A190035() {
    super(1, new long[] {0, 5, -3, 1, 1},
      new long[] {1, -2, 1});
  }
}
