package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158590 a(n) = 324*n^2 + 18.
 * @author Sean A. Irvine
 */
public class A158590 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158590() {
    super(new long[] {1, -3, 3}, new long[] {18, 342, 1314});
  }
}
