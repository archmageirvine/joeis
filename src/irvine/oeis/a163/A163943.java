package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163943 Third left hand column of triangle A163940.
 * @author Sean A. Irvine
 */
public class A163943 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163943() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 3, 17, 52, 121});
  }
}
