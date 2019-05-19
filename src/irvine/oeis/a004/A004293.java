package irvine.oeis.a004;

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A004293 Expansion of <code>(1+2*x+x^2)/(1-26*x+x^2)</code>.
 * @author Sean A. Irvine
 */
public class A004293 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A004293() {
    super(new long[] {1, 2, 1},
      new long[] {1, -26, 1});
  }
}
