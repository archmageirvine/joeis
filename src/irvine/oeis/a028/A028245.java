package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028245.
 * @author Sean A. Irvine
 */
public class A028245 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028245() {
    super(new long[] {120, -274, 225, -85, 15}, new long[] {0, 0, 0, 0, 24});
  }
}
