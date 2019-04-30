package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122602 <code>a(1) = 1; a(2) = 0; a(3) = 0; a(4) = 0; a(5) = 0; a(6) = 0; a(7) = 0; a(8) = 0; a(9) = 0; a(10) = 0; a(n) = a(n - 1) + 9a(n - 2) - 8a(n - 3) - 28a(n - 4) + 21a(n - 5) + 35a(n - 6) - 20a(n - 7) - 15a(n - 8) + 5a(n - 9) + a(n - 10)</code> for <code>n &gt;= 11</code>.
 * @author Sean A. Irvine
 */
public class A122602 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122602() {
    super(new long[] {1, 5, -15, -20, 35, 21, -28, -8, 9, 1}, new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0});
  }
}
