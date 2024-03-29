package irvine.oeis.a126;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A126566 a(0)=1; a(1)=2; a(2)=5; a(3)=14; for n&gt;3: a(n) = 8*a(n-1)-20*a(n-2)+16*a(n-3)-a(n-4).
 * @author Georg Fischer
 */
public class A126566 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A126566() {
    super(0, new long[] {1, -6, 9, -2},
      new long[] {1, -8, 20, -16, 1});
  }
}
