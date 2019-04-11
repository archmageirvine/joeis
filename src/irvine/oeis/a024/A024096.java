package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024096 <code>a(n) = 8^n - n^8</code>.
 * @author Sean A. Irvine
 */
public class A024096 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024096() {
    super(new long[] {-8, 73, -297, 708, -1092, 1134, -798, 372, -108, 17}, new long[] {1, 7, -192, -6049, -61440, -357857, -1417472, -3667649, 0, 91171007});
  }
}
