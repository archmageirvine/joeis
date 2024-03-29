package irvine.oeis.a089;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A089011 a(n) = 1 if n is an exponent of the Weyl group W(E_7), 0 otherwise.
 * @author Georg Fischer
 */
public class A089011 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A089011() {
    super(1, new long[] {0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, -1, 0, 0, 
      0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
      new long[] {1, 0, 0, 0, -1, 0, -1, 0, 0, 0, 1});
  }
}
