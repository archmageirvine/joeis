package irvine.oeis.a190;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A190577 a(n) = n*(n+2)*(n+4)*(n+6).
 * @author Sean A. Irvine
 */
public class A190577 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190577() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {105, 384, 945, 1920, 3465});
  }
}
