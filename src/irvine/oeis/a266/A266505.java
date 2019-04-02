package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266505 a(n) = 2*a(n - 2) + a(n - 4) with a(0) = -1, a(1) = 1, a(2) = 3, a(3) = 5.
 * @author Sean A. Irvine
 */
public class A266505 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266505() {
    super(new long[] {1, 0, 2, 0}, new long[] {-1, 1, 3, 5});
  }
}
