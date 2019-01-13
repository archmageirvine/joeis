package irvine.oeis.a003;

import irvine.oeis.LinearRecurrence;

/**
 * A003690.
 * @author Sean A. Irvine
 */
public class A003690 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003690() {
    super(new long[] {1, -24, 24}, new long[] {3, 75, 1728});
  }
}
