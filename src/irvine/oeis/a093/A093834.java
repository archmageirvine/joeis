package irvine.oeis.a093;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A093834 Expansion of (1-2x)^2/((1-3x)(1-4x)).
 * @author Georg Fischer
 */
public class A093834 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A093834() {
    super(0, new long[] {1, -4, 4},
      new long[] {1, -7, 12});
  }
}
