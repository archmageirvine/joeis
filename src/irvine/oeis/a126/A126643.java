package irvine.oeis.a126;

import irvine.oeis.LinearRecurrence;

/**
 * A126643.
 * @author Sean A. Irvine
 */
public class A126643 extends LinearRecurrence {

  /** Construct the sequence. */
  public A126643() {
    super(new long[] {-24, 50, -35, 10}, new long[] {6, 34, 180, 886});
  }
}
