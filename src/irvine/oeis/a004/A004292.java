package irvine.oeis.a004;

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A004292 Expansion of <code>(1+x)^2/(1-18*x+x^2)</code>.
 * @author Sean A. Irvine
 */
public class A004292 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A004292() {
    super(new long[] {1, 2, 1},
      new long[] {1, -18, 1});
  }
}
