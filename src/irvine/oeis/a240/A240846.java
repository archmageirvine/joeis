package irvine.oeis.a240;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A240846 a(0)=0, a(1)=1, a(n) = a(n-1)*12 + 13.
 * @author Georg Fischer
 */
public class A240846 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A240846() {
    super(0, new long[] {0, 1, 12},
      new long[] {1, -13, 12});
  }
}
