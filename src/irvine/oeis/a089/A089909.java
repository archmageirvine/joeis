package irvine.oeis.a089;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A089909 Sum of digits of numbers between 0 and (8/9)*(10^n-1).
 * @author Sean A. Irvine
 */
public class A089909 extends LinearRecurrence {

  /** Construct the sequence. */
  public A089909() {
    super(new long[] {-100, 220, -141, 22}, new long[] {0, 36, 748, 11460});
  }
}
