package irvine.oeis.a115;

import irvine.oeis.FiniteSequence;

/**
 * A115048 Count backwards from 100 in steps modulo n.
 * @author Georg Fischer
 */
public class A115048 extends FiniteSequence {

  /** Construct the sequence. */
  public A115048() {
    super(1, FINITE, 100, 100, 99, 96, 95, 90, 84, 80, 72, 70, 66, 60, 52, 42, 30, 16, 0);
  }
}
