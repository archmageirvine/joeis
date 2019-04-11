package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042351 Denominators of continued fraction convergents to <code>sqrt(702)</code>.
 * @author Sean A. Irvine
 */
public class A042351 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042351() {
    super(new long[] {-1, 0, 106, 0}, new long[] {1, 2, 105, 212});
  }
}
