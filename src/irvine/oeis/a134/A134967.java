package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134967.
 * @author Sean A. Irvine
 */
public class A134967 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134967() {
    super(new long[] {1, 1, 0, 0, -1}, new long[] {-1, 2, -1, 2, -3});
  }
}
