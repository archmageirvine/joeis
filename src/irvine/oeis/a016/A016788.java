package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016788 a(n) = (3*n+1)^12.
 * @author Sean A. Irvine
 */
public class A016788 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016788() {
    super(new long[] {1, -13, 78, -286, 715, -1287, 1716, -1716, 1287, -715, 286, -78, 13}, new long[] {1, 16777216, 13841287201L, 1000000000000L, 23298085122481L, 281474976710656L, 2213314919066161L, 12855002631049216L, 59604644775390625L, 232218265089212416L, 787662783788549761L, 2386420683693101056L, 6582952005840035281L});
  }
}
