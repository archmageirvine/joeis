package irvine.oeis.a155;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A155460 a(n) = 8*a(n-1)+49*a(n-2), n&gt;2 ; a(0)=1, a(1)=1, a(2)=8 .
 * @author Georg Fischer
 */
public class A155460 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A155460() {
    super(0, new long[] {1, -7, -49},
      new long[] {1, -8, -49});
  }
}
