package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130609.
 * @author Sean A. Irvine
 */
public class A130609 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130609() {
    super(new long[] {1, -1, 0, -6, 6, 0, 1}, new long[] {0, 32, 533, 669, 833, 3672, 4460});
  }
}
