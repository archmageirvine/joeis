package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042093 Denominators of continued fraction convergents to <code>sqrt(570)</code>.
 * @author Sean A. Irvine
 */
public class A042093 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042093() {
    super(new long[] {-1, 0, 0, 0, 382, 0, 0, 0}, new long[] {1, 1, 7, 8, 375, 383, 2673, 3056});
  }
}
