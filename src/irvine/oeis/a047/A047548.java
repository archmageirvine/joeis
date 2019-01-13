package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047548.
 * @author Sean A. Irvine
 */
public class A047548 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047548() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {1, 2, 3, 4, 7, 9});
  }
}
