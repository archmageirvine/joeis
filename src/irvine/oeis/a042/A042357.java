package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042357 Denominators of continued fraction convergents to sqrt(705).
 * @author Sean A. Irvine
 */
public class A042357 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042357() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 474322, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 2, 9, 29, 299, 926, 4003, 4929, 8932, 469393, 478325, 947718, 4269197, 13755309, 141822287, 439222170, 1898710967, 2337933137L, 4236644104L});
  }
}
