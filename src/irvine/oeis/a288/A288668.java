package irvine.oeis.a288;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A288668 a(n) = a(n-2) + 2*a(n-3) for n &gt;= 3, where a(0) = 2, a(2) = 4, a(3) = 5.
 * @author Sean A. Irvine
 */
public class A288668 extends LinearRecurrence {

  /** Construct the sequence. */
  public A288668() {
    super(new long[] {2, 1, 0}, new long[] {2, 4, 5});
  }
}
