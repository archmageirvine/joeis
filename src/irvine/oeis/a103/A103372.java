package irvine.oeis.a103;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A103372 a(1) = a(2) = a(3) = a(4) = a(5) = 1 and for n&gt;5: a(n) = a(n-4) + a(n-5).
 * @author Sean A. Irvine
 */
public class A103372 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103372() {
    super(1, new long[] {1, 1, 0, 0, 0}, new long[] {1, 1, 1, 1, 1});
  }
}
