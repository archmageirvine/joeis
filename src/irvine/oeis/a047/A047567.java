package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047567.
 * @author Sean A. Irvine
 */
public class A047567 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047567() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {0, 4, 5, 6, 7, 8});
  }
}
