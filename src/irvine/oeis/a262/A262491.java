package irvine.oeis.a262;

import irvine.oeis.LinearRecurrence;

/**
 * A262491.
 * @author Sean A. Irvine
 */
public class A262491 extends LinearRecurrence {

  /** Construct the sequence. */
  public A262491() {
    super(new long[] {1, -1, 0, 0, -394, 394, 0, 0, 1}, new long[] {43, 120, 549, 3783, 17214, 47629, 216688, 1490884, 6782665});
  }
}
