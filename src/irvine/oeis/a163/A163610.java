package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163610.
 * @author Sean A. Irvine
 */
public class A163610 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163610() {
    super(new long[] {-14, 8}, new long[] {5, 24});
  }
}
