package irvine.oeis.a135;
// manually triprom/tripro3 at 2023-06-01 20:27

import irvine.oeis.a000.A000012;
import irvine.oeis.a007.A007318;
import irvine.oeis.a103.A103451;
import irvine.oeis.triangle.Product;

/**
 * A135224 Triangle A103451 * A007318 * A000012, read by rows. T(n, k) for 0 &lt;= k &lt;= n.
 * @author Georg Fischer
 */
public class A135224 extends Product {

  /** Construct the sequence. */
  public A135224() {
    super(1, new Product(0, new A103451(), new A007318()), new A000012());
  }
}
