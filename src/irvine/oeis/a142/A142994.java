package irvine.oeis.a142;

import irvine.oeis.LinearRecurrence;

/**
 * A142994 Crystal ball sequence for the lattice <code>C_5</code>.
 * @author Sean A. Irvine
 */
public class A142994 extends LinearRecurrence {

  /** Construct the sequence. */
  public A142994() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 51, 501, 2471, 8361, 22363});
  }
}
