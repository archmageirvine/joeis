package irvine.oeis.a122;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A122762 a(n) = a(n-2) + a(n-4) + a(n-5) + a(n-7) + a(n-8) + a(n-10) for n &gt;= 10, with a(0) = ... = a(9) = 1.
 * @author Sean A. Irvine
 */
public class A122762 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122762() {
    super(new long[] {1, 0, 1, 1, 0, 1, 1, 0, 1, 0}, new long[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1});
  }
}
