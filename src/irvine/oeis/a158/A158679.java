package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158679 a(n) = 961*n^2 - 31.
 * @author Sean A. Irvine
 */
public class A158679 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158679() {
    super(1, new long[] {1, -3, 3}, new long[] {930, 3813, 8618});
  }
}
