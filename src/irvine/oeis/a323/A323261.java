package irvine.oeis.a323;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A323261 A323260(n)/2.
 * @author Georg Fischer
 */
public class A323261 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A323261() {
    super(0, new long[] {0, 1, -2, 0, 2, -1},
      new long[] {1, -5, 3, 5, -7, 1});
  }
}
