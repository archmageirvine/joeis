package irvine.oeis.a189;

import irvine.oeis.LinearRecurrence;

/**
 * A189376 Expansion of <code>1/((1-x)^5*(x^3+x^2+x+1)^2)</code>.
 * @author Sean A. Irvine
 */
public class A189376 extends LinearRecurrence {

  /** Construct the sequence. */
  public A189376() {
    super(new long[] {1, -3, 3, -1, -2, 6, -6, 2, 1, -3, 3}, new long[] {1, 3, 6, 10, 17, 27, 40, 56, 78, 106, 140});
  }
}
