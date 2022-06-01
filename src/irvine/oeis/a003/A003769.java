package irvine.oeis.a003;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A003769 Number of perfect matchings (or domino tilings) in K_4 X P_n.
 * @author Sean A. Irvine
 */
public class A003769 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003769() {
    super(new long[]{-1, 4, 4}, new long[]{3, 16, 75});
  }
}
