package irvine.oeis.a178;
// Generated by gen_seq4.pl triprod at 2023-05-30 18:09

import irvine.oeis.a000.A000012;
import irvine.oeis.a000.A000027;
import irvine.oeis.triangle.Product;

/**
 * A178238 Triangle read by rows: partial column sums of the triangle of natural numbers (written sequentially by rows).
 * @author Georg Fischer
 */
public class A178238 extends Product {

  /** Construct the sequence. */
  public A178238() {
    super(1, new A000012(), new A000027());
  }
}
