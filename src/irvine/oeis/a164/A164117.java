package irvine.oeis.a164;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A164117 Expansion of (1 - x) * (1 - x^10) / ((1 - x^2) * (1 - x^4) * (1 - x^5)) in powers of x.
 * @author Georg Fischer
 */
public class A164117 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A164117() {
    super(0, new long[] {1, -1, 1, -1, 1},
      new long[] {1, 0, 0, 0, -1});
  }
}
