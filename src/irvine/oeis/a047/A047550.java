package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047550.
 * @author Sean A. Irvine
 */
public class A047550 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047550() {
    super(new long[] {-1, 1, 1}, new long[] {5, 7, 13});
  }
}
