package irvine.oeis.a306;

import irvine.oeis.FiniteSequence;

/**
 * A306602 Number of elements in the ten nonconvex regular <code>4-polytopes</code> (regular <code>4-dimensional star-polytopes)</code>, as a four-column array, read by rows, with rows ordered first by increasing density, then by increasing <code>cell-count</code>, then by increasing <code>face-count</code>, then by increasing edge-count and then by increasing <code>vertex-count</code>.
 * @author Georg Fischer
 */
public class A306602 extends FiniteSequence {

  /** Construct the sequence. */
  public A306602() {
    super(120, 720, 1200, 120, 120, 1200, 720, 120, 120, 720, 720, 120, 120, 720, 720, 120, 120, 720, 720, 120, 120, 720, 720, 120, 120, 720, 1200, 120, 120, 1200, 720, 120, 120, 720, 1200, 600, 600, 1200, 720, 120);
  }
}
