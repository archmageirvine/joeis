package irvine.oeis.a104;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A104721 Expansion of (1+x)^2/(1-4*x^2).
 * @author Georg Fischer
 */
public class A104721 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A104721() {
    super(0, new long[] {1, 2, 1},
      new long[] {1, 0, -4});
  }
}
