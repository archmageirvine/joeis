package irvine.oeis.a238;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A238275 a(n) = (4*7^n - 1)/3.
 * @author Georg Fischer
 */
public class A238275 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A238275() {
    super(0, new long[] {1, 1},
      new long[] {1, -8, 7});
  }
}
