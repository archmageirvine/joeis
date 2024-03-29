package irvine.oeis.a169;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A169797 Expansion of ((1-x)/(1-2x))^10.
 * @author Georg Fischer
 */
public class A169797 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A169797() {
    super(0, new long[] {1, -10, 45, -120, 210, -252, 210, -120, 45, -10, 1},
      new long[] {1, -20, 180, -960, 3360, -8064, 13440, -15360, 11520, -5120, 1024});
  }
}
