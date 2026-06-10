package irvine.oeis.a085;

import irvine.oeis.FilterPositionSequence;

/**
 * A085254 Numbers having a unique representation as sum of two powerful numbers (A001694).
 * @author Sean A. Irvine
 */
public class A085254 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A085254() {
    super(1, new A085252(), ONE);
  }
}
