package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042432 Numerators of continued fraction convergents to sqrt(744).
 * @author Sean A. Irvine
 */
public class A042432 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042432() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 15002, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {27, 82, 109, 191, 300, 491, 791, 1282, 2073, 7501, 407127, 1228882, 1636009, 2864891, 4500900, 7365791, 11866691, 19232482, 31099173, 112530001});
  }
}
