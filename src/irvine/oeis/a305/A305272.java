package irvine.oeis.a305;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A305272 a(n) = 836*2^n - 676.
 * @author Georg Fischer
 */
public class A305272 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A305272() {
    super(0, new long[] {160, 516},
      new long[] {1, -3, 2});
  }
}
