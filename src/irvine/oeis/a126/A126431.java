package irvine.oeis.a126;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A126431 a(n) = n * 10^n.
 * @author Sean A. Irvine
 */
public class A126431 extends LinearRecurrence {

  /** Construct the sequence. */
  public A126431() {
    super(new long[] {-100, 20}, new long[] {0, 10});
  }
}
