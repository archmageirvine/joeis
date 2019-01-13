package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041241.
 * @author Sean A. Irvine
 */
public class A041241 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041241() {
    super(new long[] {-1, 0, 46, 0}, new long[] {1, 2, 45, 92});
  }
}
