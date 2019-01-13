package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135509.
 * @author Sean A. Irvine
 */
public class A135509 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135509() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 1, 25, 225, 1156, 4225, 12321});
  }
}
