package irvine.oeis.a134;
// manually binomx at 2023-06-01 10:26

import irvine.oeis.a007.A007318;
import irvine.oeis.a084.A084938;
import irvine.oeis.triangle.Product;

/**
 * A134380 A007318 * A084938.
 * @author Georg Fischer
 */
public class A134380 extends Product {

  /** Construct the sequence. */
  public A134380() {
    super(0, new A007318(), new A084938());
  }
}
