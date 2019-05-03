package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098301 Member <code>r=16</code> of the family of Chebyshev sequences <code>S_r(n)</code> defined in <code>A092184</code>.
 * @author Sean A. Irvine
 */
public class A098301 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098301() {
    super(new long[] {1, -15, 15}, new long[] {0, 1, 16});
  }
}
