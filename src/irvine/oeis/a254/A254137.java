package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254137.
 * @author Sean A. Irvine
 */
public class A254137 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254137() {
    super(new long[] {1, -1, -1154, 1154, 1}, new long[] {1, 52, 629, 59432, 725289});
  }
}
