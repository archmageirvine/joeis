package irvine.oeis.a085;

import irvine.oeis.FilterPositionSequence;

/**
 * A085266 Numbers having a unique representation as sum of a squarefree number and a square.
 * @author Sean A. Irvine
 */
public class A085266 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A085266() {
    super(1, new A085263(), ONE);
  }
}
