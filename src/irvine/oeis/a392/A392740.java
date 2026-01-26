package irvine.oeis.a392;

import irvine.oeis.FilterPositionSequence;

/**
 * A392740 Positions of 1's in A392739.
 * @author Sean A. Irvine
 */
public class A392740 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A392740() {
    super(1, 0, new A392739(), ONE);
  }
}
