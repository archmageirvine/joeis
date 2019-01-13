package irvine.oeis.a073;

import irvine.oeis.LinearRecurrence;

/**
 * A073951.
 * @author Sean A. Irvine
 */
public class A073951 extends LinearRecurrence {

  /** Construct the sequence. */
  public A073951() {
    super(new long[] {27, -36, 27, -15, 6}, new long[] {0, 1, 3, 6, 21});
  }
}
