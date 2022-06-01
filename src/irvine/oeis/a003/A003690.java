package irvine.oeis.a003;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A003690 Number of spanning trees in K_3 X P_n.
 * @author Sean A. Irvine
 */
public class A003690 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003690() {
    super(new long[] {1, -24, 24}, new long[] {3, 75, 1728});
  }
}
