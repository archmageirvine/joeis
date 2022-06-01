package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164301 a(n) = ((1+4*sqrt(2))*(5+sqrt(2))^n + (1-4*sqrt(2))*(5-sqrt(2))^n)/2.
 * @author Sean A. Irvine
 */
public class A164301 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164301() {
    super(new long[] {-23, 10}, new long[] {1, 13});
  }
}
