package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042275 Denominators of continued fraction convergents to <code>sqrt(663)</code>.
 * @author Sean A. Irvine
 */
public class A042275 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042275() {
    super(new long[] {-1, 0, 0, 0, 206, 0, 0, 0}, new long[] {1, 1, 3, 4, 203, 207, 617, 824});
  }
}
