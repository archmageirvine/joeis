package irvine.oeis.a168;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A168381 a(n) = 4*n + 2*(-1)^n.
 * @author Sean A. Irvine
 */
public class A168381 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168381() {
    super(new long[] {-1, 1, 1}, new long[] {2, 10, 10});
  }
}
