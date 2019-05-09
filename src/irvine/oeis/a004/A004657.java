package irvine.oeis.a004;

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A004657 Expansion of g.f.: <code>(1+x^3)*(1+x^4)/((1-x)*(1-x^2)^2*(1-x^4))</code>.
 * @author Sean A. Irvine
 */
public class A004657 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A004657() {
    super(new long[] {1, -1, 1, 0, 1, -1, 1}, new long[] {1, -2, 0, 2, -2, 2, 0, -2, 1});
  }
}

