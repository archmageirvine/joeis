package irvine.oeis.a133;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A133806 Alternate terms of A131708 and A000079.
 * @author Sean A. Irvine
 */
public class A133806 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133806() {
    super(new long[] {2, 0, -3, 0, 3, 0}, new long[] {0, 1, 1, 2, 2, 4});
  }
}
