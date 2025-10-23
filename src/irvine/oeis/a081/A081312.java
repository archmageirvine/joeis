package irvine.oeis.a081;

import irvine.oeis.FilterPositionSequence;

/**
 * A081312 Numbers having a unique representation as sum of a prime and an 3-smooth number.
 * @author Sean A. Irvine
 */
public class A081312 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A081312() {
    super(1, new A081308(), ONE);
  }
}

