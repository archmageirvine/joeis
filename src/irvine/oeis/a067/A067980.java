package irvine.oeis.a067;

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A067980 Convolution of L(n+1) := A000204(n+1) (Lucas), n&gt;=0, with L(n+2), n&gt;=0.
 * @author Georg Fischer
 */
public class A067980 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A067980() {
    super(0, new long[] {3, 7, 2}, new long[] {1, -2, -1, 2, 1});
  }
}
