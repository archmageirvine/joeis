package irvine.oeis.a051;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A051048 Sqrt[a(n)a(n+1)+1] of A051047.
 * @author Georg Fischer
 */
public class A051048 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A051048() {
    super(1, new long[] {0, 2, -25, -14, 57, -4},
      new long[] {1, -15, 15, -1});
  }
}
