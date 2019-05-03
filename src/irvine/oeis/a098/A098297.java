package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098297 Member <code>r=12</code> of the family of Chebyshev sequences <code>S_r(n)</code> defined in <code>A092184</code>.
 * @author Sean A. Irvine
 */
public class A098297 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098297() {
    super(new long[] {1, -11, 11}, new long[] {0, 1, 12});
  }
}
