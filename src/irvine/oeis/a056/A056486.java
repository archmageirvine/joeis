package irvine.oeis.a056;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A056486 a(n) = (9*2^n + (-2)^n)/4 for n&gt;0.
 * @author Sean A. Irvine
 */
public class A056486 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056486() {
    super(1, new long[] {4, 0}, new long[] {4, 10});
  }
}
