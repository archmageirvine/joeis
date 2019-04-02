package irvine.oeis.a240;

import irvine.oeis.LinearRecurrence;

/**
 * A240932 a(n) = n^9 - n^8.
 * @author Sean A. Irvine
 */
public class A240932 extends LinearRecurrence {

  /** Construct the sequence. */
  public A240932() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {0, 0, 256, 13122, 196608, 1562500, 8398080, 34588806, 117440512, 344373768});
  }
}
