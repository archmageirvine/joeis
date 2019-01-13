package irvine.oeis.a181;

import irvine.oeis.LinearRecurrence;

/**
 * A181718.
 * @author Sean A. Irvine
 */
public class A181718 extends LinearRecurrence {

  /** Construct the sequence. */
  public A181718() {
    super(new long[] {1000, -1110, 111}, new long[] {0, 12, 1122});
  }
}
