package irvine.oeis.a064;

import irvine.oeis.LinearRecurrence;

/**
 * A064487 Order of twisted Suzuki group Sz(2^(2*n <code>+ 1)),</code> also known as the group 2B2(2^(2*n <code>+ 1))</code>.
 * @author Sean A. Irvine
 */
public class A064487 extends LinearRecurrence {

  /** Construct the sequence. */
  public A064487() {
    super(new long[] {-268435456, 22282240, -365568, 1360}, new long[] {20, 29120, 32537600, 34093383680L});
  }
}
