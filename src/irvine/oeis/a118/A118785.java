package irvine.oeis.a118;

import irvine.oeis.FiniteSequence;

/**
 * A118785 Coordination sequence for <code>600-cell</code>: number of vertices at graph distance n from a given vertex on the skeleton of the regular <code>600-cell</code> (or <code>{5,3,3})</code>.
 * @author Georg Fischer
 */
public class A118785 extends FiniteSequence {

  /** Construct the sequence. */
  public A118785() {
    super(1, 12, 32, 42, 32, 1);
  }
}
