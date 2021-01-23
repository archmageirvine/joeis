package irvine.oeis.a255;

import irvine.oeis.LinearRecurrence;

/**
 * A255983 a(n) = 1 for n &lt;= 5; a(n) = 36*a(n-1) - 450*a(n-2) + 3000*a(n-3) - 11250*a(n-4) + 22500*a(n-5) - 18750*a(n-6) otherwise.
 * @author Sean A. Irvine
 */
public class A255983 extends LinearRecurrence {

  /** Construct the sequence. */
  public A255983() {
    super(new long[] {-18750, 22500, -11250, 3000, -450, 36}, new long[] {1, 1, 1, 1, 1, 1});
  }
}
