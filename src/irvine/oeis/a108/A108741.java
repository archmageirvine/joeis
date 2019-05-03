package irvine.oeis.a108;

import irvine.oeis.LinearRecurrence;

/**
 * A108741 Member <code>r=100</code> of the family of Chebyshev sequences <code>S_r(n)</code> defined in <code>A092184</code>.
 * @author Sean A. Irvine
 */
public class A108741 extends LinearRecurrence {

  /** Construct the sequence. */
  public A108741() {
    super(new long[] {1, -99, 99}, new long[] {0, 1, 100});
  }
}
