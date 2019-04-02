package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266973 a(n) = 4^n mod 17.
 * @author Sean A. Irvine
 */
public class A266973 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266973() {
    super(new long[] {1, 0, 0, 0}, new long[] {1, 4, 16, 13});
  }
}
