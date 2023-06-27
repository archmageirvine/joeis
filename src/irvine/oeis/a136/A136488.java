package irvine.oeis.a136;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A136488 a(n) = 2^n - A005418(n).
 * @author Sean A. Irvine
 */
public class A136488 extends LinearRecurrence {

  /** Construct the sequence. */
  public A136488() {
    super(1, new long[] {-4, 2, 2}, new long[] {1, 2, 5});
  }
}
