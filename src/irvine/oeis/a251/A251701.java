package irvine.oeis.a251;

import irvine.oeis.LinearRecurrence;

/**
 * A251701.
 * @author Sean A. Irvine
 */
public class A251701 extends LinearRecurrence {

  /** Construct the sequence. */
  public A251701() {
    super(new long[] {-3, 10, -12, 6}, new long[] {1, 4, 13, 36});
  }
}
