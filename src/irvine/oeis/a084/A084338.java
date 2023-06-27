package irvine.oeis.a084;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A084338 a(1) = 1, a(2) = 2, a(3) = 3, a(n+3) = a(n) + a(n+1).
 * @author Sean A. Irvine
 */
public class A084338 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084338() {
    super(1, new long[] {1, 1, 0}, new long[] {1, 2, 3});
  }
}
