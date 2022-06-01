package irvine.oeis.a089;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A089907 Sum of digits of numbers between 0 and (6/9)*(10^n-1).
 * @author Sean A. Irvine
 */
public class A089907 extends LinearRecurrence {

  /** Construct the sequence. */
  public A089907() {
    super(new long[] {-100, 220, -141, 22}, new long[] {0, 21, 483, 7785});
  }
}
