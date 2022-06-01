package irvine.oeis.a287;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A287439 a(n) = 2*a(n-2) + 2*a(n-3) for n &gt;= 3, where a(0) = 2, a(2) = 4, a(3) = 7.
 * @author Sean A. Irvine
 */
public class A287439 extends LinearRecurrence {

  /** Construct the sequence. */
  public A287439() {
    super(new long[] {2, 2, 0}, new long[] {2, 4, 7});
  }
}
