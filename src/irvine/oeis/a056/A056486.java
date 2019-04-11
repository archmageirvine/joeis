package irvine.oeis.a056;

import irvine.oeis.LinearRecurrence;

/**
 * A056486 <code>a(n) = (9*2^n + (-2)^n)/4</code> for <code>n&gt;0</code>.
 * @author Sean A. Irvine
 */
public class A056486 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056486() {
    super(new long[] {4, 0}, new long[] {4, 10});
  }
}
