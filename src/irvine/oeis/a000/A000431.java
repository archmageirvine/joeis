package irvine.oeis.a000;

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A000431 Expansion of 2*x^3/((1-2*x)^2*(1-4*x)).
 * @author Sean A. Irvine
 */
public class A000431 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A000431() {
    super(new long[] {0, 0, 0, 2},
      new long[] {1, -8, 20, -16});
  }
}
