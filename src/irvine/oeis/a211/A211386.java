package irvine.oeis.a211;

import irvine.oeis.LinearRecurrence;

/**
 * A211386 Expansion of 1/((1-2*x)^5*(1-x)).
 * @author Sean A. Irvine
 */
public class A211386 extends LinearRecurrence {

  /** Construct the sequence. */
  public A211386() {
    super(new long[] {-32, 112, -160, 120, -50, 11}, new long[] {1, 11, 71, 351, 1471, 5503});
  }
}
