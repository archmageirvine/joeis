package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158741 a(n) = 1369*n^2 + 37.
 * @author Sean A. Irvine
 */
public class A158741 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158741() {
    super(new long[] {1, -3, 3}, new long[] {37, 1406, 5513});
  }
}
