package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047434.
 * @author Sean A. Irvine
 */
public class A047434 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047434() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {0, 2, 4, 5, 6, 8});
  }
}
