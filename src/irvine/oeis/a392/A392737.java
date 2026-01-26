package irvine.oeis.a392;

import irvine.oeis.FilterPositionSequence;

/**
 * A392737 Positions of 1's in A392736.
 * @author Sean A. Irvine
 */
public class A392737 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A392737() {
    super(1, 0, new A392736(), ONE);
  }
}
