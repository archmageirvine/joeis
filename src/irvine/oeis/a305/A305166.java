package irvine.oeis.a305;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A305166 a(n) = 164*2^n - 140.
 * @author Georg Fischer
 */
public class A305166 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A305166() {
    super(0, new long[] {24, 116},
      new long[] {1, -3, 2});
  }
}
