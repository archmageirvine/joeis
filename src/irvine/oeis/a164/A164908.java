package irvine.oeis.a164;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A164908 a(n) = (3*4^n - 0^n)/2.
 * @author Georg Fischer
 */
public class A164908 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A164908() {
    super(0, new long[] {1, 2},
      new long[] {1, -4});
  }
}
