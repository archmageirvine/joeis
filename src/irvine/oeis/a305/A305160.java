package irvine.oeis.a305;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A305160 a(n) = 123*2^n - 99.
 * @author Georg Fischer
 */
public class A305160 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A305160() {
    super(0, new long[] {24, 75},
      new long[] {1, -3, 2});
  }
}
