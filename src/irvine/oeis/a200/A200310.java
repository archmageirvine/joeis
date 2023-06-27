package irvine.oeis.a200;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A200310 a(n) = n-1 for n &lt;= 4, otherwise if n is even then a(n) = a(n-5)+2^(n/2), and if n is odd then a(n) = a(n-1)+2^((n-3)/2).
 * @author Sean A. Irvine
 */
public class A200310 extends LinearRecurrence {

  /** Construct the sequence. */
  public A200310() {
    super(1, new long[] {-2, 2, -1, 1, -1, 1, 1}, new long[] {0, 1, 2, 3, 5, 8, 12});
  }
}
