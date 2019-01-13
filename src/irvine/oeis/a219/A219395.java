package irvine.oeis.a219;

import irvine.oeis.LinearRecurrence;

/**
 * A219395.
 * @author Sean A. Irvine
 */
public class A219395 extends LinearRecurrence {

  /** Construct the sequence. */
  public A219395() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 16, 20, 68, 76});
  }
}
