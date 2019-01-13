package irvine.oeis.a238;

import irvine.oeis.LinearRecurrence;

/**
 * A238829.
 * @author Sean A. Irvine
 */
public class A238829 extends LinearRecurrence {

  /** Construct the sequence. */
  public A238829() {
    super(new long[] {-1, 3, 1, 1, -4, 0, 3}, new long[] {1, 1, 2, 5, 12, 31, 77});
  }
}
