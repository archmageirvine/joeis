package irvine.oeis.a251;

import irvine.oeis.LinearRecurrence;

/**
 * A251610 Determinants of the spiral knots S(4,k,(1,1,1)).
 * @author Sean A. Irvine
 */
public class A251610 extends LinearRecurrence {

  /** Construct the sequence. */
  public A251610() {
    super(new long[] {-1, 2, -3, 4, -3, 2}, new long[] {1, 4, 3, 0, 5, 12});
  }
}
