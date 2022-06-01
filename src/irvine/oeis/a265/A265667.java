package irvine.oeis.a265;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A265667 Permutation of nonnegative integers: a(n) = n + floor(n/3)*(-1)^(n mod 3).
 * @author Sean A. Irvine
 */
public class A265667 extends LinearRecurrence {

  /** Construct the sequence. */
  public A265667() {
    super(new long[] {-1, 0, 0, 2, 0, 0}, new long[] {0, 1, 2, 4, 3, 6});
  }
}
