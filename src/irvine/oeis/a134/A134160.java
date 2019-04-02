package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134160 a(n) = 163 + 1053*n + 2520*n^2 + 2646*n^3 + 1029*n^4.
 * @author Sean A. Irvine
 */
public class A134160 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134160() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {163, 7411, 49981, 180793, 477463});
  }
}
