package irvine.oeis.a154;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A154996 a(n) = 5*a(n-1) + 20*a(n-2), n&gt;2 ; a(0)=1, a(1)=1, a(2)=9.
 * @author Georg Fischer
 */
public class A154996 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A154996() {
    super(0, new long[] {1, -4, -16},
      new long[] {1, -5, -20});
  }
}
