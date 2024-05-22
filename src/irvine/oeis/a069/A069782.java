package irvine.oeis.a069;

import irvine.oeis.FilterPositionSequence;

/**
 * A069773.
 * @author Sean A. Irvine
 */
public class A069782 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A069782() {
    super(1, 1, new A069780(), POWER2);
  }
}

