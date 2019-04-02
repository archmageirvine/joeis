package irvine.oeis.a121;

import irvine.oeis.LinearRecurrence;

/**
 * A121311 a(0) = 1, a(1) = 2, a(2) = 5; for n &gt;= 3, a(n) = a(n - 1) - 2*a(n - 2) + a(n - 3).
 * @author Sean A. Irvine
 */
public class A121311 extends LinearRecurrence {

  /** Construct the sequence. */
  public A121311() {
    super(new long[] {1, -2, 1}, new long[] {1, 2, 5});
  }
}
