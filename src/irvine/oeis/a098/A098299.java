package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098299 Member <code>r=14</code> of the family of Chebyshev sequences <code>S_r(n)</code> defined in <code>A092184</code>.
 * @author Sean A. Irvine
 */
public class A098299 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098299() {
    super(new long[] {1, -13, 13}, new long[] {0, 1, 14});
  }
}
