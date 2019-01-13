package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047303.
 * @author Sean A. Irvine
 */
public class A047303 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047303() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 1}, new long[] {0, 1, 2, 3, 4, 6, 7});
  }
}
