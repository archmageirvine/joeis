package irvine.oeis.a004;

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A004057 Expansion of (1-x)/( (1+x)*(1-2*x)*(1-3*x)*(1-4*x)).
 * @author Sean A. Irvine
 */
public class A004057 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A004057() {
    super(new long[] {1, -1},
      new long[] {1, -8, 17, 2, -24});
  }
}
