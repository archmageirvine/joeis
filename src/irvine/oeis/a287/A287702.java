package irvine.oeis.a287;

import irvine.oeis.LinearRecurrence;

/**
 * A287702 <code>a(n) = (3!)^3 * [z^3] hypergeom([], [1,1], z)^n</code>.
 * @author Sean A. Irvine
 */
public class A287702 extends LinearRecurrence {

  /** Construct the sequence. */
  public A287702() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 1, 56, 381});
  }
}
