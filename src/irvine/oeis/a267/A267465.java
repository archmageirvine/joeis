package irvine.oeis.a267;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A267465 Number of length-n 0..2 arrays with no following elements larger than the first repeated value.
 * @author Georg Fischer
 */
public class A267465 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A267465() {
    super(1, new long[] {0, 3, -15, 21, -7},
      new long[] {1, -8, 23, -28, 12});
  }
}
