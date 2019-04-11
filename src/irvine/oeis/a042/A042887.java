package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042887 Denominators of continued fraction convergents to <code>sqrt(975)</code>.
 * @author Sean A. Irvine
 */
public class A042887 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042887() {
    super(new long[] {-1, 0, 0, 0, 2498, 0, 0, 0}, new long[] {1, 4, 9, 40, 2489, 9996, 22481, 99920});
  }
}
