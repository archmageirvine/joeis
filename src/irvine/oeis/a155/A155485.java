package irvine.oeis.a155;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A155485 a(n) = 5^n + (1 - 4^n)/3.
 * @author Georg Fischer
 */
public class A155485 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A155485() {
    super(0, new long[] {1, -6, 9},
      new long[] {1, -10, 29, -20});
  }
}
