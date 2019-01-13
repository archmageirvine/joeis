package irvine.oeis.a138;

import irvine.oeis.LinearRecurrence;

/**
 * A138331.
 * @author Sean A. Irvine
 */
public class A138331 extends LinearRecurrence {

  /** Construct the sequence. */
  public A138331() {
    super(new long[] {-1, -7, -21, -35, -35, -21, -7}, new long[] {-16, 128, -560, 1792, -4704, 10752, -22176});
  }
}
