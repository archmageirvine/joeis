package irvine.oeis.a105;

import irvine.oeis.LinearRecurrence;

/**
 * A105040.
 * @author Sean A. Irvine
 */
public class A105040 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105040() {
    super(new long[] {1, -1, -254, 254, 1}, new long[] {0, 15, 111, 3936, 28320});
  }
}
