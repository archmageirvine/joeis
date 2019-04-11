package irvine.oeis.a113;

import irvine.oeis.LinearRecurrence;

/**
 * A113618 <code>a(n) = 1 + 2*n + 3*n^2 + 4*n^3 + 5*n^4 + 6*n^5 + 7*n^6 + 8*n^7</code>.
 * @author Sean A. Irvine
 */
public class A113618 extends LinearRecurrence {

  /** Construct the sequence. */
  public A113618() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {1, 36, 1793, 24604, 167481, 756836, 2620201, 7526268});
  }
}
