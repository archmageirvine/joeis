package irvine.oeis.a081;

import irvine.oeis.FilterPositionSequence;

/**
 * A081310 Numbers having no representation as sum of a prime and an 3-smooth number.
 * @author Sean A. Irvine
 */
public class A081310 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A081310() {
    super(1, new A081308(), ZERO);
  }
}

