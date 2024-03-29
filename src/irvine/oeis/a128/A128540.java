package irvine.oeis.a128;
// Generated by gen_seq4.pl triprod at 2023-05-30 18:09

import irvine.oeis.a097.A097806;
import irvine.oeis.a127.A127647;
import irvine.oeis.triangle.Product;

/**
 * A128540 Triangle A127647 * A097806, read by rows.
 * @author Georg Fischer
 */
public class A128540 extends Product {

  /** Construct the sequence. */
  public A128540() {
    super(1, new A127647(), new A097806());
  }
}
