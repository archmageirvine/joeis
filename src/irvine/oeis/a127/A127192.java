package irvine.oeis.a127;
// Generated by gen_seq4.pl triprom/triprod at 2023-06-01 21:50

import irvine.oeis.a054.A054523;
import irvine.oeis.triangle.Product;

/**
 * A127192 Triangle read by rows: square of A054523.
 * @author Georg Fischer
 */
public class A127192 extends Product {

  /** Construct the sequence. */
  public A127192() {
    super(1, new A054523(), new A054523());
  }
}
