package irvine.oeis.a004;

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A004297 Expansion of <code>(1+2*x+x^2)/(1-58*x+x^2)</code>.
 * @author Sean A. Irvine
 */
public class A004297 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A004297() {
    super(new long[] {1, 2, 1},
      new long[] {1, -58, 1});
  }
}
