package irvine.oeis.a057;

import irvine.oeis.LinearRecurrence;

/**
 * A057721 a(n) = n^4 + 3*n^2 + 1.
 * @author Sean A. Irvine
 */
public class A057721 extends LinearRecurrence {

  /** Construct the sequence. */
  public A057721() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 5, 29, 109, 305});
  }
}
