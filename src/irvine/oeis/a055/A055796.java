package irvine.oeis.a055;

import irvine.oeis.LinearRecurrence;

/**
 * A055796 <code>T(2n+3,n)</code>, array T as in <code>A055794</code>.
 * @author Sean A. Irvine
 */
public class A055796 extends LinearRecurrence {

  /** Construct the sequence. */
  public A055796() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 5, 16, 42, 98, 210, 420});
  }
}
