package irvine.oeis.a160;

import irvine.oeis.LinearRecurrence;

/**
 * A160333.
 * @author Sean A. Irvine
 */
public class A160333 extends LinearRecurrence {

  /** Construct the sequence. */
  public A160333() {
    super(new long[] {1, 0, 1, 0, 1, 0, 1, -1, 1}, new long[] {1, 1, 1, 1, 2, 3, 4, 5, 7});
  }
}
