package irvine.oeis.a305;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A305159 a(n) = 102*2^n - 78.
 * @author Georg Fischer
 */
public class A305159 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A305159() {
    super(0, new long[] {24, 54},
      new long[] {1, -3, 2});
  }
}
