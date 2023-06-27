package irvine.oeis.a073;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A073951 Number of strings over Z_3 of length n with trace 1 and subtrace 1.
 * @author Sean A. Irvine
 */
public class A073951 extends LinearRecurrence {

  /** Construct the sequence. */
  public A073951() {
    super(1, new long[] {27, -36, 27, -15, 6}, new long[] {0, 1, 3, 6, 21});
  }
}
