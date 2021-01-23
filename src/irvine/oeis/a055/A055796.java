package irvine.oeis.a055;

import irvine.oeis.LinearRecurrence;

/**
 * A055796 T(2n+3,n), array T as in A055794.
 * @author Sean A. Irvine
 */
public class A055796 extends LinearRecurrence {

  /** Construct the sequence. */
  public A055796() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 5, 16, 42, 98, 210, 420});
  }
}
