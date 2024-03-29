package irvine.oeis.a110;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A110687 Expansion of -(7*x^2+3*x-1)*(2*x^2+2*x+1) / ((3*x^2+3*x+1)*(2*x^3+2*x^2+4*x+1)).
 * @author Georg Fischer
 */
public class A110687 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A110687() {
    super(0, new long[] {1, -1, -11, -20, -14},
      new long[] {1, 7, 17, 20, 12, 6});
  }
}
