package irvine.oeis.a189;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A189996 Bott periodicity: the homotopy groups of the stable orthogonal group are periodic with period 8 and repeat like [2, 2, 1, 0, 1, 1, 1, 0].
 * @author Sean A. Irvine
 */
public class A189996 extends LinearRecurrence {

  /** Construct the sequence. */
  public A189996() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0}, new long[] {2, 2, 1, 0, 1, 1, 1, 0});
  }
}
