package irvine.oeis.a244;

import irvine.oeis.LinearRecurrence;

/**
 * A244870 Number of magic labelings with magic sum n of 2nd graph shown in link.
 * @author Sean A. Irvine
 */
public class A244870 extends LinearRecurrence {

  /** Construct the sequence. */
  public A244870() {
    super(new long[] {-1, 5, -9, 5, 5, -9, 5}, new long[] {1, 8, 37, 121, 318, 717, 1446});
  }
}
