package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228598.
 * @author Sean A. Irvine
 */
public class A228598 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228598() {
    super(new long[] {1, -3, 3}, new long[] {141, 240, 365});
  }
}
