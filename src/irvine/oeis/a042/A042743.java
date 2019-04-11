package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042743 Denominators of continued fraction convergents to <code>sqrt(902)</code>.
 * @author Sean A. Irvine
 */
public class A042743 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042743() {
    super(new long[] {-1, 0, 1802, 0}, new long[] {1, 30, 1801, 54060});
  }
}
