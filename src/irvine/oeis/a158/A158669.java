package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158669 a(n) = 900*n^2 - 30.
 * @author Sean A. Irvine
 */
public class A158669 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158669() {
    super(1, new long[] {1, -3, 3}, new long[] {870, 3570, 8070});
  }
}
