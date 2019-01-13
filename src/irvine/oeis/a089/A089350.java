package irvine.oeis.a089;

import irvine.oeis.LinearRecurrence;

/**
 * A089350.
 * @author Sean A. Irvine
 */
public class A089350 extends LinearRecurrence {

  /** Construct the sequence. */
  public A089350() {
    super(new long[] {-100, 220, -141, 22}, new long[] {0, 20, 360, 5520});
  }
}
