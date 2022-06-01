package irvine.oeis.a076;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A076040 a(n) = (-1)^n * (3^n - 1)/2.
 * @author Sean A. Irvine
 */
public class A076040 extends LinearRecurrence {

  /** Construct the sequence. */
  public A076040() {
    super(new long[] {-3, -4}, new long[] {0, -1});
  }
}
