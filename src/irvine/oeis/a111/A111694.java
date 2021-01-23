package irvine.oeis.a111;

import irvine.oeis.LinearRecurrence;

/**
 * A111694 a(1) = 1+2-3 = 0, a(2) = 4+5+6-7 = 8, a(3) = 8+9+10+11-12 = 26, a(4) = 13+14+15+16+17-18 = 57, ...
 * @author Sean A. Irvine
 */
public class A111694 extends LinearRecurrence {

  /** Construct the sequence. */
  public A111694() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 8, 26, 57});
  }
}
