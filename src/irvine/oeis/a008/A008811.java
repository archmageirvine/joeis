package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008811 Expansion of <code>x(1+x^4)/((1-x)^2*(1-x^4))</code>.
 * @author Sean A. Irvine
 */
public class A008811 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008811() {
    super(new long[] {0, 1, 0, 0, 0, 1}, new int[] {1, 1, 4});
  }
}

