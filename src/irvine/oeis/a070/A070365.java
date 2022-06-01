package irvine.oeis.a070;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A070365 a(n) = 5^n mod 7.
 * @author Sean A. Irvine
 */
public class A070365 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070365() {
    super(new long[] {1, -1, 0, 1}, new long[] {1, 5, 4, 6});
  }
}
