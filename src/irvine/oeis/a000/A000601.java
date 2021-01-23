package irvine.oeis.a000;

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A000601 Expansion of 1/((1-x)^2*(1-x^2)*(1-x^3)).
 * @author Sean A. Irvine
 */
public class A000601 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A000601() {
    super(new long[] {1},
      new long[] {1, -2, 0, 1, 1, 0, -2, 1});
  }
}
