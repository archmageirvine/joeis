package irvine.oeis.a136;
// manually triprom/tripro3 at 2023-06-01 20:27

import irvine.oeis.a000.A000012;
import irvine.oeis.a001.A001263;
import irvine.oeis.a128.A128064;
import irvine.oeis.triangle.Product;

/**
 * A136536 A001263 * A128064 * A000012 as infinite lower triangular matrices.
 * @author Georg Fischer
 */
public class A136536 extends Product {

  /** Construct the sequence. */
  public A136536() {
    super(1, new Product(0, new A001263(), new A128064()), new A000012());
  }
}
