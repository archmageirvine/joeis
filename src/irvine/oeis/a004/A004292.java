package irvine.oeis.a004;

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A004292 Expansion of (1+x)^2/(1-18*x+x^2).
 * @author Sean A. Irvine
 */
public class A004292 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A004292() {
    super(new long[] {1, 2, 1},
      new long[] {1, -18, 1});
  }
}
