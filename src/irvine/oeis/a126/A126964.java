package irvine.oeis.a126;

import irvine.oeis.LinearRecurrence;

/**
 * A126964 a(n) = 2*n*(6*n-1).
 * @author Sean A. Irvine
 */
public class A126964 extends LinearRecurrence {

  /** Construct the sequence. */
  public A126964() {
    super(new long[] {1, -3, 3}, new long[] {0, 10, 44});
  }
}
