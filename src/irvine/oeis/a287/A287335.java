package irvine.oeis.a287;

import irvine.oeis.LinearRecurrence;

/**
 * A287335 Nonnegative numbers k such that 3*k <code>+ 2</code> is a cube.
 * @author Sean A. Irvine
 */
public class A287335 extends LinearRecurrence {

  /** Construct the sequence. */
  public A287335() {
    super(new long[] {-1, 4, -6, 4}, new long[] {2, 41, 170, 443});
  }
}
