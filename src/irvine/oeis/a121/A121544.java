package irvine.oeis.a121;

import irvine.oeis.LinearRecurrence;

/**
 * A121544 Sum of all proper base 4 numbers with n digits (those not beginning with <code>0)</code>.
 * @author Sean A. Irvine
 */
public class A121544 extends LinearRecurrence {

  /** Construct the sequence. */
  public A121544() {
    super(new long[] {-64, 20}, new long[] {6, 114});
  }
}
