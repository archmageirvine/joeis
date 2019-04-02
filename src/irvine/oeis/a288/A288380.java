package irvine.oeis.a288;

import irvine.oeis.LinearRecurrence;

/**
 * A288380 a(n) = 3*a(n-1) - 3*a(n-2) + 3*a(n-3) - 3*a(n-4) + a(n-5) for n &gt;= 1, where a(0) = 2, a(1) = 4, a(2) = 7. a(3) = 11, a(4) = 20.
 * @author Sean A. Irvine
 */
public class A288380 extends LinearRecurrence {

  /** Construct the sequence. */
  public A288380() {
    super(new long[] {1, -3, 3, -3, 3}, new long[] {2, 4, 7, 11, 20});
  }
}
