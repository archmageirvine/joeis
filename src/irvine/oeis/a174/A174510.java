package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174510.
 * @author Sean A. Irvine
 */
public class A174510 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174510() {
    super(new long[] {1, 0, 0, -5, 0, 0, 5, 0, 0}, new long[] {1, 1, 3, 1, 9, 13, 1, 37, 51});
  }
}
