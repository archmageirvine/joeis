package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163114.
 * @author Sean A. Irvine
 */
public class A163114 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163114() {
    super(new long[] {5, 0}, new long[] {3, 5});
  }
}
