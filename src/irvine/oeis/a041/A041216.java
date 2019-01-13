package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041216.
 * @author Sean A. Irvine
 */
public class A041216 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041216() {
    super(new long[] {-1, 0, 0, 0, 240, 0, 0, 0}, new long[] {10, 11, 109, 120, 2509, 2629, 26170, 28799});
  }
}
