package irvine.oeis.a246;

import irvine.oeis.LinearRecurrence;

/**
 * A246943.
 * @author Sean A. Irvine
 */
public class A246943 extends LinearRecurrence {

  /** Construct the sequence. */
  public A246943() {
    super(new long[] {-1, 0, 0, 0, 2, 0, 0, 0}, new long[] {0, 4, 1, 12, 4, 20, 3, 28});
  }
}
