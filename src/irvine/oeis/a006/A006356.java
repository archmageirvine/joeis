package irvine.oeis.a006;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A006356 a(n) = 2*a(n-1) + a(n-2) - a(n-3) for n &gt;= 3, starting with a(0) = 1, a(1) = 3, and a(2) = 6.
 * @author Sean A. Irvine
 */
public class A006356 extends LinearRecurrence {

  /** Construct the sequence. */
  public A006356() {
    super(new long[] {-1, 1, 2}, new long[] {1, 3, 6});
  }
}

