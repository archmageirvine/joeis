package irvine.oeis.a139;

import irvine.oeis.LinearRecurrence;

/**
 * A139798 Coefficient of <code>x^5</code> in <code>(1-x-x^2)^(-n)</code>.
 * @author Sean A. Irvine
 */
public class A139798 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139798() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {8, 38, 111, 256, 511, 924});
  }
}
