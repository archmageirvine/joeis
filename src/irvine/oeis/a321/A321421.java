package irvine.oeis.a321;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A321421 a(n) = 10*(4^n - 1)/3 + 1.
 * @author Georg Fischer
 */
public class A321421 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A321421() {
    super(0, new long[] {1, 6},
      new long[] {1, -5, 4});
  }
}
