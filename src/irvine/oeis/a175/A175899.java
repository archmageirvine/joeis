package irvine.oeis.a175;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A175899 a(n) = a(n-2) + a(n-3) + 2*a(n-4), with a(1) = 0, a(2) = 2, a(3) = 3, a(4) = 10.
 * @author Sean A. Irvine
 */
public class A175899 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175899() {
    super(1, new long[] {2, 1, 1, 0}, new long[] {0, 2, 3, 10});
  }
}
