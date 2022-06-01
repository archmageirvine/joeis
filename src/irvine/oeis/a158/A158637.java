package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158637 a(n) = 576*n^2 + 24.
 * @author Sean A. Irvine
 */
public class A158637 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158637() {
    super(new long[] {1, -3, 3}, new long[] {24, 600, 2328});
  }
}
