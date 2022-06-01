package irvine.oeis.a056;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A056161 Solutions (value of x) of Diophantine equation 2*x^2 + 3*x + 2 = r^2.
 * @author Sean A. Irvine
 */
public class A056161 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056161() {
    super(new long[] {1, -1, -34, 34, 1}, new long[] {2, 7, 94, 263, 3218});
  }
}
