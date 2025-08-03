package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158219 a(n) = 169*n - 1.
 * @author Sean A. Irvine
 */
public class A158219 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158219() {
    super(1, new long[] {-1, 2}, new long[] {168, 337});
  }
}
