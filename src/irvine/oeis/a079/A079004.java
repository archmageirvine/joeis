package irvine.oeis.a079;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A079004 Least x&gt;=3 such that F(x)==1 (mod 3^n) where F(x) denotes the x-th Fibonacci number (A000045).
 * @author Georg Fischer
 */
public class A079004 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A079004() {
    super(1, new long[] {0, 1701, -4374, -2187, 5832},
      new long[] {243, -972, 729});
  }
}
