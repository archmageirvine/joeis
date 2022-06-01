package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158219 169n - 1.
 * @author Sean A. Irvine
 */
public class A158219 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158219() {
    super(new long[] {-1, 2}, new long[] {168, 337});
  }
}
