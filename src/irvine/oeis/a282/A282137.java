package irvine.oeis.a282;

import irvine.oeis.LinearRecurrence;

/**
 * A282137.
 * @author Sean A. Irvine
 */
public class A282137 extends LinearRecurrence {

  /** Construct the sequence. */
  public A282137() {
    super(new long[] {16, -16, 1}, new long[] {1, 11, -29});
  }
}
