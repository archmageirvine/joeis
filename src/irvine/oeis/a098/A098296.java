package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098296 Member <code>r=11</code> of the family of Chebyshev sequences <code>S_r(n)</code> defined in <code>A092184</code>.
 * @author Sean A. Irvine
 */
public class A098296 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098296() {
    super(new long[] {1, -10, 10}, new long[] {0, 1, 11});
  }
}
