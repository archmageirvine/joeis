package irvine.oeis.a154;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A154997 a(n) = 6*a(n-1) + 30*a(n-2), n&gt;2; a(0)=1, a(1)=1, a(2)=11.
 * @author Georg Fischer
 */
public class A154997 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A154997() {
    super(0, new long[] {1, -5, -25},
      new long[] {1, -6, -30});
  }
}
