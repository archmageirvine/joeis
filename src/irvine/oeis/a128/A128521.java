package irvine.oeis.a128;
// manually triprom/tripro3 at 2023-06-01 20:27

import irvine.oeis.a000.A000012;
import irvine.oeis.a054.A054525;
import irvine.oeis.triangle.Product;

/**
 * A128521 A128174 * A054525 * A000012.
 * @author Georg Fischer
 */
public class A128521 extends Product {

  /** Construct the sequence. */
  public A128521() {
    super(1, new Product(0, new A128174(), new A054525()), new A000012());
  }
}
