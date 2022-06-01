package irvine.oeis.a089;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A089904 Sum of digits of numbers between 0 and (2/9)*(10^n-1).
 * @author Sean A. Irvine
 */
public class A089904 extends LinearRecurrence {

  /** Construct the sequence. */
  public A089904() {
    super(new long[] {-100, 220, -141, 22}, new long[] {0, 3, 109, 2055});
  }
}
