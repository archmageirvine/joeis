package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163274.
 * @author Sean A. Irvine
 */
public class A163274 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163274() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 2, 72, 648, 3200, 11250, 31752});
  }
}
