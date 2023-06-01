package irvine.oeis.a143;
// manually triprom/tripro3 at 2023-06-01 20:27

import irvine.oeis.a000.A000012;
import irvine.oeis.a127.A127648;
import irvine.oeis.a130.A130207;
import irvine.oeis.triangle.Product;

/**
 * A143269 Triangle read by rows, A127648 * A000012 * A130207, 1&lt;=k&lt;=n.
 * @author Georg Fischer
 */
public class A143269 extends Product {

  /** Construct the sequence. */
  public A143269() {
    super(1, new Product(0, new A127648(), new A000012()), new A130207());
  }
}
