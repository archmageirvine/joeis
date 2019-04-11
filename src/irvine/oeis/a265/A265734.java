package irvine.oeis.a265;

import irvine.oeis.LinearRecurrence;

/**
 * A265734 Permutation of nonnegative integers: <code>a(n) = n + floor(n/5)*(-1)^(n mod 5)</code>.
 * @author Sean A. Irvine
 */
public class A265734 extends LinearRecurrence {

  /** Construct the sequence. */
  public A265734() {
    super(new long[] {-1, 0, 0, 0, 0, 2, 0, 0, 0, 0}, new long[] {0, 1, 2, 3, 4, 6, 5, 8, 7, 10});
  }
}
