package irvine.oeis.a280;

import irvine.oeis.FiniteSequence;

/**
 * A280325 Deviations in hours between A280323 tropical years and A280324 synodic (lunar) months (rounded to nearest hour).
 * @author Georg Fischer
 */
public class A280325 extends FiniteSequence {

  /** Construct the sequence. */
  public A280325() {
    super(1, FINITE, 261, -187, 74, -38, 36, -2, 1, 0);
  }
}
