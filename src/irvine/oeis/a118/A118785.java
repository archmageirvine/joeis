package irvine.oeis.a118;

import irvine.oeis.FiniteSequence;

/**
 * A118785 Coordination sequence for 600-cell: number of vertices at graph distance n from a given vertex on the skeleton of the regular 600-cell (or {5,3,3}).
 * @author Georg Fischer
 */
public class A118785 extends FiniteSequence {

  /** Construct the sequence. */
  public A118785() {
    super(1, 12, 32, 42, 32, 1);
  }
}
