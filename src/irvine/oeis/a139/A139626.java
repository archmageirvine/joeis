package irvine.oeis.a139;

import irvine.oeis.LinearRecurrence;

/**
 * A139626 <code>a(n) = binomial(n+4, 4)*6^n</code>.
 * @author Sean A. Irvine
 */
public class A139626 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139626() {
    super(new long[] {7776, -6480, 2160, -360, 30}, new long[] {1, 30, 540, 7560, 90720});
  }
}
