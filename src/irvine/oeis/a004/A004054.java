package irvine.oeis.a004;

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A004054 Expansion of (1-x)/((1+x)*(1-2*x)*(1-3*x)).
 * @author Sean A. Irvine
 */
public class A004054 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A004054() {
    super(new long[] {1, -1},
      new long[] {1, -4, 1, 6});
  }
}
