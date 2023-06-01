package irvine.oeis.a135;
// manually triprom/tripro3 at 2023-06-01 20:27

import irvine.oeis.a000.A000012;
import irvine.oeis.a103.A103451;
import irvine.oeis.a127.A127648;
import irvine.oeis.triangle.Product;

/**
 * A135223 Triangle A000012 * A127648 * A103451, read by rows.
 * @author Georg Fischer
 */
public class A135223 extends Product {

  /** Construct the sequence. */
  public A135223() {
    super(1, new Product(0, new A000012(), new A127648()), new A103451());
  }
}
