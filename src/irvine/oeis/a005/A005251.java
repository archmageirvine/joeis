package irvine.oeis.a005;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A005251 a(0) = 0, a(1) = a(2) = a(3) = 1; thereafter, a(n) = a(n-1) + a(n-2) + a(n-4).
 * @author Sean A. Irvine
 */
public class A005251 extends LinearRecurrence {

  /** Construct the sequence. */
  public A005251() {
    super(new long[] {1, 0, 1, 1}, new long[] {0, 1, 1, 1});
  }
}

