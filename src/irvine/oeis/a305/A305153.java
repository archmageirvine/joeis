package irvine.oeis.a305;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A305153 a(n) = 30*2^n + 12.
 * @author Georg Fischer
 */
public class A305153 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A305153() {
    super(0, new long[] {42, -54},
      new long[] {1, -3, 2});
  }
}
