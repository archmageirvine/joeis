package irvine.oeis.a111;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A111365 a(n) = 5*a(n-1) + 3*a(n-2) where a(0) = a(1) = 1.
 * @author Sean A. Irvine
 */
public class A111365 extends LinearRecurrence {

  /** Construct the sequence. */
  public A111365() {
    super(new long[] {3, 5}, new long[] {1, 1});
  }
}
