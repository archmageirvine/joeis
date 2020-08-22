package irvine.oeis.a003;

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A003479 Expansion of 1/((1-x)*(1-x-2*x^3)).
 * @author Sean A. Irvine
 */
public class A003479 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A003479() {
    super(new long[] {1},
      new long[] {1, -2, 1, -2, 2});
  }
}

