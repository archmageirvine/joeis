package irvine.oeis.a004;

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A004298 Expansion of <code>(1+2*x+x^2)/(1-66*x+x^2)</code>.
 * @author Sean A. Irvine
 */
public class A004298 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A004298() {
    super(new long[] {1, 2, 1},
      new long[] {1, -66, 1});
  }
}
