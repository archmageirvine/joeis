package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168194 a(n) = n^4*(n^3 + 1)/2.
 * @author Sean A. Irvine
 */
public class A168194 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168194() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {0, 1, 72, 1134, 8320, 39375, 140616, 412972});
  }
}
