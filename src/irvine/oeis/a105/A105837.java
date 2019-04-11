package irvine.oeis.a105;

import irvine.oeis.LinearRecurrence;

/**
 * A105837 Numbers n such that <code>n^2 =</code> 11*m^2 + 11*m <code>+ 1</code>.
 * @author Sean A. Irvine
 */
public class A105837 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105837() {
    super(new long[] {-1, 0, 398, 0}, new long[] {1, 131, 529, 52139});
  }
}
