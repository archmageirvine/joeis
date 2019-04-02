package irvine.oeis.a057;

import irvine.oeis.LinearRecurrence;

/**
 * A057366 a(n) = floor(7*n/19).
 * @author Sean A. Irvine
 */
public class A057366 extends LinearRecurrence {

  /** Construct the sequence. */
  public A057366() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 7});
  }
}
