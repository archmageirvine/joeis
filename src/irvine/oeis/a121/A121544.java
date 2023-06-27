package irvine.oeis.a121;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A121544 Sum of all proper base 4 numbers with n digits (those not beginning with 0).
 * @author Sean A. Irvine
 */
public class A121544 extends LinearRecurrence {

  /** Construct the sequence. */
  public A121544() {
    super(1, new long[] {-64, 20}, new long[] {6, 114});
  }
}
