package irvine.oeis.a143;
// manually triprom/tripro3 at 2023-06-01 20:27

import irvine.oeis.a000.A000012;
import irvine.oeis.a130.A130207;
import irvine.oeis.triangle.Product;

/**
 * A143230 Triangle read by rows, A130207 * A000012 * A130207.
 * @author Georg Fischer
 */
public class A143230 extends Product {

  /** Construct the sequence. */
  public A143230() {
    super(1, new Product(0, new A130207(), new A000012()), new A130207());
  }
}
