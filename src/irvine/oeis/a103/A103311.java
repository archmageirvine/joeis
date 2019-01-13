package irvine.oeis.a103;

import irvine.oeis.LinearRecurrence;

/**
 * A103311.
 * @author Sean A. Irvine
 */
public class A103311 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103311() {
    super(new long[] {-1, 2, -4, 3}, new long[] {0, 1, 1, 0});
  }
}
