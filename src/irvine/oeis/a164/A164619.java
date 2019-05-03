package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164619 Integers of the form <code>A164577(k)/3</code>.
 * @author Sean A. Irvine
 */
public class A164619 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164619() {
    super(new long[] {-1, 2, -1, -1, 2, -1, 2, -4, 2, 2, -4, 2, -1, 2, -1, -1, 2}, new long[] {4, 15, 54, 75, 132, 169, 320, 459, 735, 847, 1104, 1250, 1764, 2175, 2904, 3179, 3780});
  }
}
