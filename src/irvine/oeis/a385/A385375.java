package irvine.oeis.a385;

import irvine.oeis.FiniteSequence;

/**
 * A385375 Numbers k that can't be partitioned into tau(k) distinct parts.
 * @author Sean A. Irvine
 */
public class A385375 extends FiniteSequence {

  /** Construct the sequence. */
  public A385375() {
    super(1, FINITE, 2, 4, 6, 8, 12, 18, 20, 24, 30, 36, 48, 60, 72, 120);
  }
}

