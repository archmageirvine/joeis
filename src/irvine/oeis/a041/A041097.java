package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041097.
 * @author Sean A. Irvine
 */
public class A041097 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041097() {
    super(new long[] {-1, 0, 30, 0}, new long[] {1, 2, 29, 60});
  }
}
