package irvine.oeis.a108;

import irvine.oeis.LinearRecurrence;

/**
 * A108741.
 * @author Sean A. Irvine
 */
public class A108741 extends LinearRecurrence {

  /** Construct the sequence. */
  public A108741() {
    super(new long[] {1, -99, 99}, new long[] {0, 1, 100});
  }
}
