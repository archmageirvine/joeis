package irvine.oeis.a140;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A140300 a(n) = 1024^n.
 * @author Georg Fischer
 */
public class A140300 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A140300() {
    super(0, new long[] {1},
      new long[] {1, -1024});
  }
}
