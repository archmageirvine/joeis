package irvine.oeis.a294;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A294172 Maximum value of the cyclic convolution of the first n positive integers with themselves.
 * @author Georg Fischer
 */
public class A294172 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A294172() {
    super(1, new long[] {0, 1, 3, 2, 1},
      new long[] {1, -2, -1, 4, -1, -2, 1});
  }
}
