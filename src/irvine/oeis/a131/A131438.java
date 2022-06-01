package irvine.oeis.a131;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A131438 (2+n)*2^n-2-3*n.
 * @author Sean A. Irvine
 */
public class A131438 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131438() {
    super(new long[] {-4, 12, -13, 6}, new long[] {1, 8, 29, 82});
  }
}
