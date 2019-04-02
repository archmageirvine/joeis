package irvine.oeis.a089;

import irvine.oeis.LinearRecurrence;

/**
 * A089905 Sum of digits of numbers between 0 and (3/9)*(10^n-1).
 * @author Sean A. Irvine
 */
public class A089905 extends LinearRecurrence {

  /** Construct the sequence. */
  public A089905() {
    super(new long[] {-100, 220, -141, 22}, new long[] {0, 6, 183, 3285});
  }
}
