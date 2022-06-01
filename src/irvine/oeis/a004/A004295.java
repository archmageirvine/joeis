package irvine.oeis.a004;

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A004295 Expansion of (1+2*x+x^2)/(1-42*x+x^2).
 * @author Sean A. Irvine
 */
public class A004295 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A004295() {
    super(new long[] {1, 2, 1},
      new long[] {1, -42, 1});
  }
}
