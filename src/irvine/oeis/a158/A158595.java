package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158595 a(n) = 361*n^2 - 19.
 * @author Sean A. Irvine
 */
public class A158595 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158595() {
    super(new long[] {1, -3, 3}, new long[] {342, 1425, 3230});
  }
}
