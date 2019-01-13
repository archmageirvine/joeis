package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047553.
 * @author Sean A. Irvine
 */
public class A047553 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047553() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, 2, 6, 7, 8});
  }
}
