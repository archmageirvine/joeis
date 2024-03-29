package irvine.oeis.a073;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A073397 Eighth convolution of A002605(n) (generalized (2,2)-Fibonacci), n&gt;=0, with itself.
 * @author Georg Fischer
 */
public class A073397 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A073397() {
    super(0, new long[] {1},
      new long[] {1, -18, 126, -384, 144, 2016, -3360, -4608, 12384, 8512, -24768, 
      -18432, 26880, 32256, -4608, -24576, -16128, -4608, -512});
  }
}
