package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025928.
 * @author Sean A. Irvine
 */
public class A025928 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025928() {
    super(new long[] {-264, 310, -125, 20}, new long[] {1, 20, 275, 3310});
  }
}
