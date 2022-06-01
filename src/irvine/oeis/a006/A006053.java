package irvine.oeis.a006;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A006053 a(n) = a(n-1) + 2*a(n-2) - a(n-3).
 * @author Sean A. Irvine
 */
public class A006053 extends LinearRecurrence {

  /** Construct the sequence. */
  public A006053() {
    super(new long[] {-1, 2, 1}, new long[] {0, 0, 1});
  }
}

