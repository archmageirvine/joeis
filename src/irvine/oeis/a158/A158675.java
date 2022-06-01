package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158675 a(n) = 961*n^2 + 31.
 * @author Sean A. Irvine
 */
public class A158675 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158675() {
    super(new long[] {1, -3, 3}, new long[] {31, 992, 3875});
  }
}
