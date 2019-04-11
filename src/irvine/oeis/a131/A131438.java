package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131438 <code>(2+n)*2^n-2-3*n</code>.
 * @author Sean A. Irvine
 */
public class A131438 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131438() {
    super(new long[] {-4, 12, -13, 6}, new long[] {1, 8, 29, 82});
  }
}
