package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158401 <code>a(n) = 841*n^2 - 2*n</code>.
 * @author Sean A. Irvine
 */
public class A158401 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158401() {
    super(new long[] {1, -3, 3}, new long[] {839, 3360, 7563});
  }
}
