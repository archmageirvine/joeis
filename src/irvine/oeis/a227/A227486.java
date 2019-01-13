package irvine.oeis.a227;

import irvine.oeis.LinearRecurrence;

/**
 * A227486.
 * @author Sean A. Irvine
 */
public class A227486 extends LinearRecurrence {

  /** Construct the sequence. */
  public A227486() {
    super(new long[] {64, -160, 148, -64, 13}, new long[] {5298, 39854, 251046, 1422550, 7507638});
  }
}
