package irvine.oeis.a143;
// manually triprom/tripro3 at 2023-06-01 20:27

import irvine.oeis.a000.A000012;
import irvine.oeis.a136.A136521;
import irvine.oeis.triangle.Product;

/**
 * A143956 Triangle read by rows, A000012 * A136521 * A000012; 1&lt;=k&lt;=n.
 * @author Georg Fischer
 */
public class A143956 extends Product {

  /** Construct the sequence. */
  public A143956() {
    super(1, new Product(0, new A000012(), new A136521()), new A000012());
  }
}
