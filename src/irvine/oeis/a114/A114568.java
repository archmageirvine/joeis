package irvine.oeis.a114;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A114568 a(n) = 4694*a(n-2) + 9380*a(n-3) for n &gt;= 3 with a(0) = 0 and a(1) = a(2) = 1.
 * @author Sean A. Irvine
 */
public class A114568 extends LinearRecurrence {

  /** Construct the sequence. */
  public A114568() {
    super(new long[] {9380, 4694, 0}, new long[] {0, 1, 1});
  }
}
