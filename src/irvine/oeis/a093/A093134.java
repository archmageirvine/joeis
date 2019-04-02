package irvine.oeis.a093;

import irvine.oeis.LinearRecurrence;

/**
 * A093134 A Jacobsthal trisection.
 * @author Sean A. Irvine
 */
public class A093134 extends LinearRecurrence {

  /** Construct the sequence. */
  public A093134() {
    super(new long[] {8, 7}, new long[] {1, 0});
  }
}
