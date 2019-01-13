package irvine.oeis.a086;

import irvine.oeis.LinearRecurrence;

/**
 * A086225.
 * @author Sean A. Irvine
 */
public class A086225 extends LinearRecurrence {

  /** Construct the sequence. */
  public A086225() {
    super(new long[] {-2, 3}, new long[] {10, 21});
  }
}
