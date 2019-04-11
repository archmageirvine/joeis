package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042219 Denominators of continued fraction convergents to <code>sqrt(635)</code>.
 * @author Sean A. Irvine
 */
public class A042219 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042219() {
    super(new long[] {-1, 0, 252, 0}, new long[] {1, 5, 251, 1260});
  }
}
