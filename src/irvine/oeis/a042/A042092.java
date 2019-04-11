package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042092 Numerators of continued fraction convergents to <code>sqrt(570)</code>.
 * @author Sean A. Irvine
 */
public class A042092 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042092() {
    super(new long[] {-1, 0, 0, 0, 382, 0, 0, 0}, new long[] {23, 24, 167, 191, 8953, 9144, 63817, 72961});
  }
}
