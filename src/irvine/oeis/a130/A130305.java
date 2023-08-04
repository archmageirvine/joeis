package irvine.oeis.a130;

import irvine.oeis.a007.A007318;
import irvine.oeis.triangle.Product;

/**
 * A130305 Triangle read by rows: A007318 * A130304 as infinite lower triangular matrices.
 * @author Georg Fischer
 */
public class A130305 extends Product {

  /** Construct the sequence. */
  public A130305() {
    super(1, new A007318(), new A130304());
  }
}
