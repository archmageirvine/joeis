package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158589 a(n) = 324*n^2 - 18.
 * @author Sean A. Irvine
 */
public class A158589 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158589() {
    super(new long[] {1, -3, 3}, new long[] {306, 1278, 2898});
  }
}
