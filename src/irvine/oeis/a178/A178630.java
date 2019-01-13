package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178630.
 * @author Sean A. Irvine
 */
public class A178630 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178630() {
    super(new long[] {1000, -1110, 111}, new long[] {18, 2178, 221778});
  }
}
