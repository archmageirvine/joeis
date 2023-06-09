package irvine.oeis.a126;
// manually triprom/triprod at 2023-06-09 07:29

import irvine.oeis.a061.A061554;
import irvine.oeis.triangle.Inverse;
import irvine.oeis.triangle.Product;

/**
 * A126127 Inverse square of A061554.
 * @author Georg Fischer
 */
public class A126127 extends Inverse {

  /** Construct the sequence. */
  public A126127() {
    super(0, new Product(0, new A061554(), new A061554()));
  }
}
