package irvine.oeis.a131;
// manually triprod at 2021-10-13

import irvine.oeis.a097.A097806;
import irvine.oeis.a130.A130296;
import irvine.oeis.triangle.Product;

/**
 * A131032 A097806 * A130296.
 * @author Georg Fischer
 */
public class A131032 extends Product {

  /** Construct the sequence. */
  public A131032() {
    super(1, new A097806(), new A130296());
  }
}
