package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163275.
 * @author Sean A. Irvine
 */
public class A163275 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163275() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {0, 2, 144, 1944, 12800, 56250, 190512, 537824});
  }
}
