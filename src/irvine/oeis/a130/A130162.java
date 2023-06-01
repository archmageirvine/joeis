package irvine.oeis.a130;
// manually triprom/triprov at 2023-05-31 18:05

import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000837;
import irvine.oeis.a051.A051731;
import irvine.oeis.triangle.VectorProduct;

/**
 * A130162 Triangle read by rows: A051731 * A000837 as a diagonalized matrix.
 * @author Georg Fischer
 */
public class A130162 extends VectorProduct {

  /** Construct the sequence. */
  public A130162() {
    super(0, new A051731(), new SkipSequence(new A000837(), 1));
  }
}
