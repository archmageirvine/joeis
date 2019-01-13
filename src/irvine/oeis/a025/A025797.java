package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025797.
 * @author Sean A. Irvine
 */
public class A025797 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025797() {
    super(new long[] {1, 0, -1, -1, 0, 1, 0, 0, -1, 0, 1, 1, 0}, new long[] {1, 0, 1, 1, 1, 1, 2, 1, 3, 2, 3, 3, 4});
  }
}
