package irvine.oeis.a083;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A083328 a(n) = (6^n - 5^n + 4^n - 3^n)/2.
 * @author Sean A. Irvine
 */
public class A083328 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083328() {
    super(new long[] {-360, 342, -119, 18}, new long[] {0, 1, 9, 64});
  }
}
