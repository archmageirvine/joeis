package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041401.
 * @author Sean A. Irvine
 */
public class A041401 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041401() {
    super(new long[] {-1, 0, 0, 0, 88, 0, 0, 0}, new long[] {1, 1, 2, 3, 86, 89, 175, 264});
  }
}
