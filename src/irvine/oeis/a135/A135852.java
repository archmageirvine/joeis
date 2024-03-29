package irvine.oeis.a135;
// Generated by gen_seq4.pl triprod at 2023-05-30 18:09

import irvine.oeis.a007.A007318;
import irvine.oeis.a103.A103516;
import irvine.oeis.triangle.Product;

/**
 * A135852 A007318 * A103516 as a lower triangular matrix.
 * @author Georg Fischer
 */
public class A135852 extends Product {

  /** Construct the sequence. */
  public A135852() {
    super(0, new A007318(), new A103516());
  }
}
