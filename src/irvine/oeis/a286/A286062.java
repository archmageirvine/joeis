package irvine.oeis.a286;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A286062 a(n) = 2*a(n-1) + a(n-2) - a(n-3), where a(0) = 2, a(1) = 3, a(2) = 6.
 * @author Sean A. Irvine
 */
public class A286062 extends LinearRecurrence {

  /** Construct the sequence. */
  public A286062() {
    super(new long[] {-1, 1, 2}, new long[] {2, 3, 6});
  }
}
