package irvine.oeis.a071;

import irvine.oeis.FilterPositionSequence;

/**
 * A071561 Numbers with no middle divisors (cf. A071090).
 * @author Sean A. Irvine
 */
public class A071562 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A071562() {
    super(1, 1, new A071090(), NONZERO);
  }
}
