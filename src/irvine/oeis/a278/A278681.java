package irvine.oeis.a278;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A278681 Pisot sequence T(3,16).
 * @author Georg Fischer
 */
public class A278681 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A278681() {
    super(0, new long[] {3, -2, 1, -1},
      new long[] {1, -6, 4, -2, 2});
  }
}
