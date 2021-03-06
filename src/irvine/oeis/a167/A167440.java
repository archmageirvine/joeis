package irvine.oeis.a167;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A167440 5th GegenbauerC polynomial evaluated at powers of 2 (multiplied by 5).
 * @author Georg Fischer
 */
public class A167440 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A167440() {
    super(1, new long[] {0, -2, -640, -512},
      new long[] {-1, 42, -336, 512});
  }
}
