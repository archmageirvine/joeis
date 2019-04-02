package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042251 Denominators of continued fraction convergents to sqrt(651).
 * @author Sean A. Irvine
 */
public class A042251 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042251() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 3470, 0, 0, 0, 0, 0}, new long[] {1, 1, 2, 33, 35, 68, 3435, 3503, 6938, 114511, 121449, 235960});
  }
}
