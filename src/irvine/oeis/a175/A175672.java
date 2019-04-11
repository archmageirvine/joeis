package irvine.oeis.a175;

import irvine.oeis.LinearRecurrence;

/**
 * A175672 y-values in the solution to <code>x^2 -</code> 28*y^2=1.
 * @author Sean A. Irvine
 */
public class A175672 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175672() {
    super(new long[] {-1, 254}, new long[] {0, 24});
  }
}
