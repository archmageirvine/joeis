package irvine.oeis.a025;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A025962 Expansion of 1/((1-2x)(1-4x)(1-5x)(1-10x)).
 * @author Georg Fischer
 */
public class A025962 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A025962() {
    super(0, new long[] {1},
      new long[] {1, -21, 148, -420, 400});
  }
}
