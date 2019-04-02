package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042789 Denominators of continued fraction convergents to sqrt(925).
 * @author Sean A. Irvine
 */
public class A042789 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042789() {
    super(new long[] {1, 0, 0, 0, 0, 1764, 0, 0, 0, 0}, new long[] {1, 2, 5, 12, 29, 1752, 3533, 8818, 21169, 51156});
  }
}
