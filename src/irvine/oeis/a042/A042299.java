package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042299 Denominators of continued fraction convergents to <code>sqrt(675)</code>.
 * @author Sean A. Irvine
 */
public class A042299 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042299() {
    super(new long[] {-1, 0, 52, 0}, new long[] {1, 1, 51, 52});
  }
}
