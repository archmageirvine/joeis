package irvine.oeis.a304;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A304615 a(n) = 507*2^n - 273.
 * @author Georg Fischer
 */
public class A304615 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A304615() {
    super(0, new long[] {234, 39},
      new long[] {1, -3, 2});
  }
}
