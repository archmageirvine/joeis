package irvine.oeis.a003;

import irvine.oeis.LinearRecurrence;

/**
 * A003747 Number of perfect matchings (or domino tilings) in <code>K_5 X P_2n</code>.
 * @author Sean A. Irvine
 */
public class A003747 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003747() {
    super(new long[]{1, -76, 76}, new long[] {56, 4181, 313501});
  }
}
