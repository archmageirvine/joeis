package irvine.oeis.a100;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A100149 Structured small rhombicubeoctahedral numbers.
 * @author Georg Fischer
 */
public class A100149 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A100149() {
    super(1, new long[] {0, 1, 20, 16},
      new long[] {1, -4, 6, -4, 1});
  }
}
