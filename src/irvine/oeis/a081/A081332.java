package irvine.oeis.a081;

import irvine.oeis.FilterPositionSequence;

/**
 * A081332 Numbers having a unique partition into two 3-smooth numbers.
 * @author Sean A. Irvine
 */
public class A081332 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A081332() {
    super(1, new A081326(), ONE);
  }
}

