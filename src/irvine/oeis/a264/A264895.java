package irvine.oeis.a264;

import irvine.oeis.LinearRecurrence;

/**
 * A264895 a(n) = n*(4*n - 3)*(16*n^2 - 12*n - 3).
 * @author Sean A. Irvine
 */
public class A264895 extends LinearRecurrence {

  /** Construct the sequence. */
  public A264895() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 1, 370, 2835, 10660});
  }
}
