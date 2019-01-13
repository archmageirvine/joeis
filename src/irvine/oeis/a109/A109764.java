package irvine.oeis.a109;

import irvine.oeis.LinearRecurrence;

/**
 * A109764.
 * @author Sean A. Irvine
 */
public class A109764 extends LinearRecurrence {

  /** Construct the sequence. */
  public A109764() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 14, 204, 1240, 4900, 14910, 38024});
  }
}
