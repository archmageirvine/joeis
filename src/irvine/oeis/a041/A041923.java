package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041923.
 * @author Sean A. Irvine
 */
public class A041923 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041923() {
    super(new long[] {-1, 0, 44, 0}, new long[] {1, 1, 43, 44});
  }
}
