package irvine.oeis.a089;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A089903 Sum of digits of numbers between 0 and (1/9)*(10^n-1).
 * @author Sean A. Irvine
 */
public class A089903 extends LinearRecurrence {

  /** Construct the sequence. */
  public A089903() {
    super(new long[] {-100, 220, -141, 22}, new long[] {0, 1, 48, 960});
  }
}
