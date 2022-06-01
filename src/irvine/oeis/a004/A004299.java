package irvine.oeis.a004;

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A004299 Expansion of (1+2*x+x^2)/(1-74*x+x^2).
 * @author Sean A. Irvine
 */
public class A004299 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A004299() {
    super(new long[] {1, 2, 1},
      new long[] {1, -74, 1});
  }
}
