package irvine.oeis.a302;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A302507 a(n) = 4*(3^n-1).
 * @author Georg Fischer
 */
public class A302507 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A302507() {
    super(0, new long[] {0, 8},
      new long[] {1, -4, 3});
  }
}
