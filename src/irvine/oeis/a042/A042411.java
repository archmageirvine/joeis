package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042411 Denominators of continued fraction convergents to <code>sqrt(733)</code>.
 * @author Sean A. Irvine
 */
public class A042411 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042411() {
    super(new long[] {1, 0, 0, 0, 0, 19764, 0, 0, 0, 0}, new long[] {1, 13, 14, 27, 365, 19737, 256946, 276683, 533629, 7213860});
  }
}
