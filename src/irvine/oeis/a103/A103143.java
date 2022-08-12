package irvine.oeis.a103;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A103143 a(n) = a(n-1) + a(n-2) + 3*a(n-3), with a(0) = 1, a(1) = 0, a(2) = 1.
 * @author Sean A. Irvine
 */
public class A103143 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103143() {
    super(new long[] {3, 1, 1}, new long[] {0, 0, 1});
  }
}
