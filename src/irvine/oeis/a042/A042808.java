package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042808 Numerators of continued fraction convergents to sqrt(935).
 * @author Sean A. Irvine
 */
public class A042808 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042808() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 2752, 0, 0, 0, 0, 0, 0, 0}, new long[] {30, 31, 61, 153, 214, 581, 795, 1376, 83355, 84731, 168086, 420903, 588989, 1598881, 2187870, 3786751});
  }
}
