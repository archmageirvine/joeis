package irvine.oeis.a025;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A025007 Expansion of 1/((1-x)(1-8x)(1-10x)(1-12x)).
 * @author Georg Fischer
 */
public class A025007 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A025007() {
    super(0, new long[] {1},
      new long[] {1, -31, 326, -1256, 960});
  }
}
