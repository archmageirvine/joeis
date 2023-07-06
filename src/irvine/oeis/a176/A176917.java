package irvine.oeis.a176;
// manually triprom/triprov at 2023-05-31 19:38

import irvine.oeis.a002.A002033;
import irvine.oeis.a077.A077049;
import irvine.oeis.triangle.VectorProduct;

/**
 * A176917 Triangle read by rows, A077049 * the diagonalized version of A002033.
 * @author Georg Fischer
 */
public class A176917 extends VectorProduct {

  /** Construct the sequence. */
  public A176917() {
    super(1, new A077049(), new A002033());
  }
}
