package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174685.
 * @author Sean A. Irvine
 */
public class A174685 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174685() {
    super(new long[] {1, -1, -1154, 1154, 1}, new long[] {0, 75, 244, 86359, 281384});
  }
}
