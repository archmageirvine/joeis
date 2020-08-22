package irvine.oeis.a021;

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A021834 Expansion of 1/((1-x)*(1-4*x)*(1-6*x)*(1-11*x)).
 * @author Sean A. Irvine
 */
public class A021834 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A021834() {
    super(new long[] {1},
      new long[] {1, -22, 155, -398, 264});
  }
}
