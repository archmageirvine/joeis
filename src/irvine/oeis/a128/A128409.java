package irvine.oeis.a128;
// Generated by gen_seq4.pl triprod at 2023-06-09 15:51

import irvine.oeis.a000.A000012;
import irvine.oeis.triangle.Product;

/**
 * A128409 Triangle read by rows: A000012 * A128408 as infinite lower triangular matrices.
 * @author Georg Fischer
 */
public class A128409 extends Product {

  /** Construct the sequence. */
  public A128409() {
    super(1, new A000012(), new A128408());
  }
}
