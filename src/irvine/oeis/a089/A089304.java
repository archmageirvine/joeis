package irvine.oeis.a089;

import irvine.oeis.LinearRecurrence;

/**
 * A089304.
 * @author Sean A. Irvine
 */
public class A089304 extends LinearRecurrence {

  /** Construct the sequence. */
  public A089304() {
    super(new long[] {-100, 220, -141, 22}, new long[] {0, 2, 51, 975});
  }
}
