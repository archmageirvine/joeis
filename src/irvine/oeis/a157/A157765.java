package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157765 Expansion of (2 - 2*x) / (1 - 10*x - 7*x^2).
 * @author Sean A. Irvine
 */
public class A157765 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157765() {
    super(new long[] {7, 10}, new long[] {2, 18});
  }
}
