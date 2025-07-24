package irvine.oeis.a078;

import irvine.oeis.a056.A056857;
import irvine.oeis.triangle.Product;

/**
 * A078939 Fourth power of lower triangular matrix of A056857 (successive equalities in set partitions of n).
 * @author Sean A. Irvine
 */
public class A078939 extends Product {

  /** Construct the sequence. */
  public A078939() {
    super(0, new A078938(), new A056857());
  }
}
