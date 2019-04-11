package irvine.oeis.a191;

import irvine.oeis.LinearRecurrence;

/**
 * A191698 <code>a(n) = (122n^3 + 140n^2 + 45n + 3n(-1)^n)/8</code>.
 * @author Sean A. Irvine
 */
public class A191698 extends LinearRecurrence {

  /** Construct the sequence. */
  public A191698() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {0, 38, 204, 585, 1280, 2370});
  }
}
