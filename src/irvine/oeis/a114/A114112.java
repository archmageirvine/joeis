package irvine.oeis.a114;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A114112 a(1)=1, a(2)=2; thereafter a(n) = n+1 if n odd, n-1 if n even.
 * @author Georg Fischer
 */
public class A114112 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A114112() {
    super(1, new long[] {0, 1, 1, 1, -2, 1},
      new long[] {1, -1, -1, 1});
  }
}
