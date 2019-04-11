package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042733 Denominators of continued fraction convergents to <code>sqrt(896)</code>.
 * @author Sean A. Irvine
 */
public class A042733 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042733() {
    super(new long[] {-1, 0, 0, 0, 898, 0, 0, 0}, new long[] {1, 1, 14, 15, 884, 899, 12571, 13470});
  }
}
