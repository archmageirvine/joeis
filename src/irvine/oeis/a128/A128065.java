package irvine.oeis.a128;
// Generated by gen_seq4.pl triprod at 2023-05-30 18:09

import irvine.oeis.a007.A007318;
import irvine.oeis.triangle.Product;

/**
 * A128065 Binomial transform of A128064.
 * @author Georg Fischer
 */
public class A128065 extends Product {

  /** Construct the sequence. */
  public A128065() {
    super(1, new A007318(), new A128064());
  }
}
