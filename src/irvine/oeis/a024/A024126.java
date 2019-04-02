package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024126 a(n) = 10^n - n^12.
 * @author Sean A. Irvine
 */
public class A024126 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024126() {
    super(new long[] {-10, 131, -793, 2938, -7436, 13585, -18447, 18876, -14586, 8437, -3575, 1066, -208, 23}, new long[] {1, 9, -3996, -530441, -16767216, -244040625, -2175782336L, -13831287201L, -68619476736L, -281429536481L, -990000000000L, -3038428376721L, -7916100448256L, -13298085122481L});
  }
}
