package irvine.oeis.a131;
// Generated by gen_seq4.pl triprom/triprod at 2023-06-07 15:59

import irvine.oeis.a065.A065941;
import irvine.oeis.a097.A097807;
import irvine.oeis.triangle.Product;

/**
 * A131332 Triangle read by rows: A065941 * A097807.
 * @author Georg Fischer
 */
public class A131332 extends Product {

  /** Construct the sequence. */
  public A131332() {
    super(1, new A065941(), new A097807());
  }
}
