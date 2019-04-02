package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024125 a(n) = 10^n - n^11.
 * @author Sean A. Irvine
 */
public class A024125 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024125() {
    super(new long[] {10, -121, 672, -2266, 5170, -8415, 10032, -8844, 5742, -2695, 880, -186, 22}, new long[] {1, 9, -1948, -176147, -4184304, -48728125, -361797056, -1967326743, -8489934592L, -30381059609L, -90000000000L, -185311670611L, 256991629312L});
  }
}
