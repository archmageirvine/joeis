package irvine.oeis.a004;

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A004058 Expansion of <code>(1-x)/( (1+x)*(1-2*x)*(1-3*x)*(1-4*x)*(1-5*x))</code>.
 * @author Sean A. Irvine
 */
public class A004058 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A004058() {
    super(new long[] {1, -1}, new long[] {1, -13, 57, -83, -34, 120});
  }
}
