package irvine.oeis.a108;

import irvine.oeis.FiniteSequence;

/**
 * A108507 Number of paths of length n between two arbitrary, distinct vertices in K5, the complete graph on 5 vertices.
 * @author Georg Fischer
 */
public class A108507 extends FiniteSequence {

  /** Construct the sequence. */
  public A108507() {
    super(1, FINITE, 1, 3, 6, 18, 48, 78, 96, 132, 132);
  }
}
