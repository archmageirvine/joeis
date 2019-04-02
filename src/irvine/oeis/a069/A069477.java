package irvine.oeis.a069;

import irvine.oeis.LinearRecurrence;

/**
 * A069477 a(n) = 60*n^2 + 180*n + 150.
 * @author Sean A. Irvine
 */
public class A069477 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069477() {
    super(new long[] {1, -3, 3}, new long[] {390, 750, 1230});
  }
}
