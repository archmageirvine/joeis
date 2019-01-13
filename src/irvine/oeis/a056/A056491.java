package irvine.oeis.a056;

import irvine.oeis.LinearRecurrence;

/**
 * A056491.
 * @author Sean A. Irvine
 */
public class A056491 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056491() {
    super(new long[] {120, -120, -154, 154, 71, -71, -14, 14, 1}, new long[] {0, 0, 0, 0, 0, 0, 0, 60, 120});
  }
}
