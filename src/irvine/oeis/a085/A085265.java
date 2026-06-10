package irvine.oeis.a085;

import irvine.oeis.FilterPositionSequence;

/**
 * A085265 Numbers that can be written as sum of a positive squarefree number and a positive square.
 * @author Sean A. Irvine
 */
public class A085265 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A085265() {
    super(1, new A085263(), NONZERO);
  }
}
