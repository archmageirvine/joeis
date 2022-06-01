package irvine.oeis.a054;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A054880 a(n) = 3*(9^n - 1)/4.
 * @author Sean A. Irvine
 */
public class A054880 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054880() {
    super(new long[] {-9, 10}, new long[] {0, 6});
  }
}
