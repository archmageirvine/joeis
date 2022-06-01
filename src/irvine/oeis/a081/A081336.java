package irvine.oeis.a081;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A081336 a(n) = (7^n + 3^n)/2.
 * @author Sean A. Irvine
 */
public class A081336 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081336() {
    super(new long[] {-21, 10}, new long[] {1, 5});
  }
}
