package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266229 a(n) = n^12 - n^11 + n^10 - n^9 + n^8 - n^7 + n^6 - n^5 + n^4 - n^3 + n^2 - n + 1.
 * @author Sean A. Irvine
 */
public class A266229 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266229() {
    super(new long[] {1, -13, 78, -286, 715, -1287, 1716, -1716, 1287, -715, 286, -78, 13}, new long[] {1, 1, 2731, 398581, 13421773, 203450521, 1865813431, 12111126301L, 61083979321L, 254186582833L, 909090909091L, 2876892678661L, 8230246567621L});
  }
}
