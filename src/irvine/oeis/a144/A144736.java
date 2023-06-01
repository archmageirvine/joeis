package irvine.oeis.a144;
// manually triprom/tripro3 at 2023-05-31 18:05

import irvine.oeis.a000.A000012;
import irvine.oeis.a051.A051731;
import irvine.oeis.a054.A054533;
import irvine.oeis.triangle.Product;

/**
 * A144736 Triangle read by rows, A051731 * A000012 * A051731 * A054533.
 * @author Georg Fischer
 */
public class A144736 extends Product {

  /** Construct the sequence. */
  public A144736() {
    super(1, new Product(0, new Product(0, new A051731(), new A000012()), new A051731()), new A054533());
  }
}
