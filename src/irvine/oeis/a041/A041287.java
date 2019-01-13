package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041287.
 * @author Sean A. Irvine
 */
public class A041287 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041287() {
    super(new long[] {-1, 0, 50, 0}, new long[] {1, 2, 49, 100});
  }
}
