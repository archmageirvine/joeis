package irvine.oeis.a040;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A040075 5-fold convolution of A000302 (powers of 4); expansion of 1/(1-4*x)^5.
 * @author Georg Fischer
 */
public class A040075 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A040075() {
    super(0, new long[] {1},
      new long[] {1, -20, 160, -640, 1280, -1024});
  }
}
