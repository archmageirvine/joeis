package irvine.oeis.a183;
// manually 2021-05-25

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A183641 Number of (n+1)X9 0..3 arrays with every 2x2 subblock summing to 6.
 * @author Georg Fischer
 */
public class A183641 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A183641() { 
    super(1, new long[] {0, 302536, -2638956, 7288136, -6291456},
      new long[] {1, -10, 35, -50, 24});
  }
}
