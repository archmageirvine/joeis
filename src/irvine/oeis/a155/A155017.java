package irvine.oeis.a155;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A155017 a(n) = 10*a(n-1) + 90*a(n-2), n&gt;2 ; a(0)=1, a(1)=1, a(2)=19 .
 * @author Georg Fischer
 */
public class A155017 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A155017() {
    super(0, new long[] {1, -9, -81},
      new long[] {1, -10, -90});
  }
}
