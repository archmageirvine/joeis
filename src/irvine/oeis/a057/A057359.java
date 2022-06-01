package irvine.oeis.a057;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A057359 a(n) = floor(5*n/7).
 * @author Sean A. Irvine
 */
public class A057359 extends LinearRecurrence {

  /** Construct the sequence. */
  public A057359() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 1}, new long[] {0, 0, 1, 2, 2, 3, 4, 5});
  }
}
