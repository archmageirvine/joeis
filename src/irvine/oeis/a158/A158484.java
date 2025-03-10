package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158484 a(n) = 49*n^2 - 7.
 * @author Sean A. Irvine
 */
public class A158484 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158484() {
    super(1, new long[] {1, -3, 3}, new long[] {42, 189, 434});
  }
}
