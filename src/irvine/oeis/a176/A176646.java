package irvine.oeis.a176;

import irvine.oeis.LinearRecurrence;

/**
 * A176646 <code>12*n^5 + 25*n^4 + 5*n^3 - 10*n^2 - 2*n</code>.
 * @author Sean A. Irvine
 */
public class A176646 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176646() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 30, 780, 4980, 18840, 53490});
  }
}
