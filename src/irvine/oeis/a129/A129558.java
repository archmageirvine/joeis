package irvine.oeis.a129;
// Generated by gen_seq4.pl robot/triprod at 2023-07-04 10:40

import irvine.oeis.a054.A054523;
import irvine.oeis.triangle.Product;

/**
 * A129558 A054523 * A129360.
 * @author Georg Fischer
 */
public class A129558 extends Product {

  /** Construct the sequence. */
  public A129558() {
    super(1, new A054523(), new A129360());
  }
}
