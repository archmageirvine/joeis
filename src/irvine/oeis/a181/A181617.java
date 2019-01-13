package irvine.oeis.a181;

import irvine.oeis.LinearRecurrence;

/**
 * A181617.
 * @author Sean A. Irvine
 */
public class A181617 extends LinearRecurrence {

  /** Construct the sequence. */
  public A181617() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 4, 24, 72});
  }
}
