package irvine.oeis.a057;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A057361 a(n) = floor(5*n/8).
 * @author Sean A. Irvine
 */
public class A057361 extends LinearRecurrence {

  /** Construct the sequence. */
  public A057361() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 1}, new long[] {0, 0, 1, 1, 2, 3, 3, 4, 5});
  }
}
