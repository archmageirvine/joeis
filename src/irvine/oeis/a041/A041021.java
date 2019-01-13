package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041021.
 * @author Sean A. Irvine
 */
public class A041021 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041021() {
    super(new long[] {-1, 0, 0, 0, 30, 0, 0, 0}, new long[] {1, 1, 3, 4, 27, 31, 89, 120});
  }
}
