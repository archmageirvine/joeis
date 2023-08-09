package irvine.oeis.a167;
// manually triprom/triprov at 2023-05-31 19:38

import irvine.oeis.a010.A010060;
import irvine.oeis.a047.A047999;
import irvine.oeis.triangle.TruncatedTriangle;
import irvine.oeis.triangle.VectorProduct;

/**
 * A167364 Triangle read by rows, A047999 * A010060 (diagonalized); as infinite lower triangular matrices.
 * @author Georg Fischer
 */
public class A167364 extends TruncatedTriangle {

  /** Construct the sequence. */
  public A167364() {
    super(1, new VectorProduct(1, new A047999(), new A010060()));
  }
}
