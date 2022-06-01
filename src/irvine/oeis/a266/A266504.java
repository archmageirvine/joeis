package irvine.oeis.a266;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A266504 a(n) = 2*a(n - 2) + a(n - 4) with a(0) = a(1) = 2, a(2) = 1, a(3) = 3.
 * @author Sean A. Irvine
 */
public class A266504 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266504() {
    super(new long[] {1, 0, 2, 0}, new long[] {2, 2, 1, 3});
  }
}
