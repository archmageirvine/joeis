package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042293 Denominators of continued fraction convergents to <code>sqrt(672)</code>.
 * @author Sean A. Irvine
 */
public class A042293 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042293() {
    super(new long[] {-1, 0, 0, 0, 674, 0, 0, 0}, new long[] {1, 1, 12, 13, 662, 675, 8087, 8762});
  }
}
