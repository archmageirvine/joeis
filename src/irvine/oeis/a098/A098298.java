package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098298 Member <code>r=13</code> of the family of Chebyshev sequences <code>S_r(n)</code> defined in <code>A092184</code>.
 * @author Sean A. Irvine
 */
public class A098298 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098298() {
    super(new long[] {1, -12, 12}, new long[] {0, 1, 13});
  }
}
