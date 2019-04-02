package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042758 Numerators of continued fraction convergents to sqrt(910).
 * @author Sean A. Irvine
 */
public class A042758 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042758() {
    super(new long[] {-1, 0, 362, 0}, new long[] {30, 181, 10890, 65521});
  }
}
