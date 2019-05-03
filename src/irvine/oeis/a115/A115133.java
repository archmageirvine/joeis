package irvine.oeis.a115;

import irvine.oeis.LinearRecurrence;

/**
 * A115133 Partial sums of <code>A064061</code>.
 * @author Sean A. Irvine
 */
public class A115133 extends LinearRecurrence {

  /** Construct the sequence. */
  public A115133() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {429, 1859, 5291, 12363, 25623, 48879, 87639, 149655, 245586});
  }
}
