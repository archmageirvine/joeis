package irvine.oeis.a145;
// Generated by gen_seq4.pl triprom/triprod at 2023-06-05 19:25

import irvine.oeis.a053.A053121;
import irvine.oeis.triangle.Product;

/**
 * A145973 Triangle read by rows, square of A053121.
 * @author Georg Fischer
 */
public class A145973 extends Product {

  /** Construct the sequence. */
  public A145973() {
    super(0, new A053121(), new A053121());
  }
}
