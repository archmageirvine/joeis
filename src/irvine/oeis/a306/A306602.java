package irvine.oeis.a306;

import irvine.oeis.FiniteSequence;

/**
 * A306602 Number of elements in the ten nonconvex regular 4-polytopes (regular 4-dimensional star-polytopes), as a four-column array, read by rows, with rows ordered first by increasing density, then by increasing cell-count, then by increasing face-count, then by increasing edge-count and then by increasing vertex-count.
 * @author Georg Fischer
 */
public class A306602 extends FiniteSequence {

  /** Construct the sequence. */
  public A306602() {
    super(120, 720, 1200, 120, 120, 1200, 720, 120, 120, 720, 720, 120, 120, 720, 720, 120, 120, 720, 720, 120, 120, 720, 720, 120, 120, 720, 1200, 120, 120, 1200, 720, 120, 120, 720, 1200, 600, 600, 1200, 720, 120);
  }
}
