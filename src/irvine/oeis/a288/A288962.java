package irvine.oeis.a288;

import irvine.oeis.LinearRecurrence;

/**
 * A288962.
 * @author Sean A. Irvine
 */
public class A288962 extends LinearRecurrence {

  /** Construct the sequence. */
  public A288962() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 1, 9, 60, 250, 765});
  }
}
