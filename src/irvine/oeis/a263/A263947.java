package irvine.oeis.a263;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A263947 Positive integers n such that (n+57)^3 - n^3 is a square.
 * @author Sean A. Irvine
 */
public class A263947 extends LinearRecurrence {

  /** Construct the sequence. */
  public A263947() {
    super(new long[] {1, -1, -115598, 115598, 1}, new long[] {551, 13471, 67002512, 1560515752, 7745359676111L});
  }
}
