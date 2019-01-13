package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163655.
 * @author Sean A. Irvine
 */
public class A163655 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163655() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 10, 31, 69});
  }
}
