package irvine.oeis.a224;

import irvine.oeis.LinearRecurrence;

/**
 * A224521.
 * @author Sean A. Irvine
 */
public class A224521 extends LinearRecurrence {

  /** Construct the sequence. */
  public A224521() {
    super(new long[] {-2, 3, -1, 0, 0, -2, 3}, new long[] {0, 1, 3, 7, 15, 31, 62});
  }
}
