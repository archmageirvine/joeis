package irvine.oeis.a154;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A154533 Number of constants of the form a^3*u + b*c*v, where a, b, c are linear, u of order n-3 and v of order n-2.
 * @author Sean A. Irvine
 */
public class A154533 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154533() {
    super(new long[] {1, -3, 3}, new long[] {10, 9, 10});
  }
}
