package irvine.oeis.a080;

import irvine.oeis.FiniteSequence;

/**
 * A080631 Consider 3 X 3 X 3 Rubik cube, but consider only positions of edges; sequence gives number of positions that are exactly n moves from the start up to equivalence under the full group of order 48 of the cube.
 * @author Georg Fischer
 */
public class A080631 extends FiniteSequence {

  /** Construct the sequence. */
  public A080631() {
    super(1, 1, 5, 25, 215, 1860, 16481, 144334, 1242992, 10324847, 76993295, 371975385L, 382690120L, 8235392, 54, 1);
  }
}
