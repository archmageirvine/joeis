package irvine.oeis.a006;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A006131 a(n) = a(n-1) + 4*a(n-2), a(0) = a(1) = 1.
 * @author Sean A. Irvine
 */
public class A006131 extends LinearRecurrence {

  /** Construct the sequence. */
  public A006131() {
    super(new long[] {4, 1}, new long[] {1, 1});
  }
}

