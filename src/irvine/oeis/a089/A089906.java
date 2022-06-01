package irvine.oeis.a089;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A089906 Sum of digits of numbers between 0 and (4/9)*(10^n-1).
 * @author Sean A. Irvine
 */
public class A089906 extends LinearRecurrence {

  /** Construct the sequence. */
  public A089906() {
    super(new long[] {-100, 220, -141, 22}, new long[] {0, 10, 270, 4650});
  }
}
