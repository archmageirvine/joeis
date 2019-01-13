package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041008.
 * @author Sean A. Irvine
 */
public class A041008 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041008() {
    super(new long[] {-1, 0, 0, 0, 16, 0, 0, 0}, new long[] {2, 3, 5, 8, 37, 45, 82, 127});
  }
}
