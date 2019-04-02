package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024021 2^n-n^11.
 * @author Sean A. Irvine
 */
public class A024021 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024021() {
    super(new long[] {2, -25, 144, -506, 1210, -2079, 2640, -2508, 1782, -935, 352, -90, 14}, new long[] {1, 1, -2044, -177139, -4194288, -48828093, -362796992, -1977326615, -8589934336L, -31381059097L, -99999998976L, -285311668563L, -743008366592L});
  }
}
