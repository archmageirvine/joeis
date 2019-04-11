package irvine.oeis.a209;

import irvine.oeis.LinearRecurrence;

/**
 * A209359 <code>a(n) = 2^n * (n^4 - 4*n^3 + 18*n^2 - 52*n + 75) - 75</code>.
 * @author Sean A. Irvine
 */
public class A209359 extends LinearRecurrence {

  /** Construct the sequence. */
  public A209359() {
    super(new long[] {-32, 112, -160, 120, -50, 11}, new long[] {0, 1, 33, 357, 2405, 12405});
  }
}
