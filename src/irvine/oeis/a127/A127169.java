package irvine.oeis.a127;
// manually triprom/tripro3 at 2023-06-01 20:27

import irvine.oeis.a126.A126988;
import irvine.oeis.triangle.Product;

/**
 * A127169 Triangle read by rows: cube of A126988.
 * @author Georg Fischer
 */
public class A127169 extends Product {

  /** Construct the sequence. */
  public A127169() {
    super(1, new Product(0, new A126988(), new A126988()), new A126988());
  }
}
