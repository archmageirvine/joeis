package irvine.oeis.a054;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A054329 One quarter of fourth unsigned column of Lanczos' triangle A053125.
 * @author Georg Fischer
 */
public class A054329 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A054329() {
    super(0, new long[] {1, 4},
      new long[] {1, -16, 96, -256, 256});
  }
}
