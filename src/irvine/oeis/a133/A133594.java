package irvine.oeis.a133;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A133594 a(n)=3*a(n-1)+12*a(n-2) for n&gt;=3, a(0)=1, a(1)=3, a(2)=18 .
 * @author Georg Fischer
 */
public class A133594 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A133594() {
    super(0, new long[] {1, 0, -3},
      new long[] {1, -3, -12});
  }
}
