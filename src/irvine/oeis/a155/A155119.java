package irvine.oeis.a155;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A155119 a(n) = 5*a(n-1) + 5*a(n-2), n &gt; 2, a(0)=1, a(1)=4, a(2)=24.
 * @author Georg Fischer
 */
public class A155119 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A155119() {
    super(0, new long[] {1, -1, -1},
      new long[] {1, -5, -5});
  }
}
