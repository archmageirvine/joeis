package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226451 a(n) = n*(7*n^2-12*n+7)/2.
 * @author Sean A. Irvine
 */
public class A226451 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226451() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 1, 11, 51});
  }
}
