package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047286.
 * @author Sean A. Irvine
 */
public class A047286 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047286() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {1, 2, 3, 6, 8});
  }
}
