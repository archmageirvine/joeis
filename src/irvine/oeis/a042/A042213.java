package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042213 Denominators of continued fraction convergents to <code>sqrt(632)</code>.
 * @author Sean A. Irvine
 */
public class A042213 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042213() {
    super(new long[] {-1, 0, 0, 0, 15486, 0, 0, 0}, new long[] {1, 7, 43, 308, 15443, 108409, 665897, 4769688});
  }
}
