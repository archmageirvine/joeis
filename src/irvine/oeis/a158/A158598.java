package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158598 <code>a(n) = 40*n^2 - 1</code>.
 * @author Sean A. Irvine
 */
public class A158598 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158598() {
    super(new long[] {1, -3, 3}, new long[] {39, 159, 359});
  }
}
