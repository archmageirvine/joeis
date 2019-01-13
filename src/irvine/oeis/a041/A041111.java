package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041111.
 * @author Sean A. Irvine
 */
public class A041111 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041111() {
    super(new long[] {-1, 0, 16, 0}, new long[] {1, 1, 15, 16});
  }
}
