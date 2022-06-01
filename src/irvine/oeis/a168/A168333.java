package irvine.oeis.a168;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A168333 a(n) = (14*n + 7*(-1)^n + 1)/4.
 * @author Sean A. Irvine
 */
public class A168333 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168333() {
    super(new long[] {-1, 1, 1}, new long[] {2, 9, 9});
  }
}
