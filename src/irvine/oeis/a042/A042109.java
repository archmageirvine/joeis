package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042109 Denominators of continued fraction convergents to <code>sqrt(579)</code>.
 * @author Sean A. Irvine
 */
public class A042109 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042109() {
    super(new long[] {-1, 0, 770, 0}, new long[] {1, 16, 769, 12320});
  }
}
