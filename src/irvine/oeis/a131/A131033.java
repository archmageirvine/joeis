package irvine.oeis.a131;
// manually triprod at 2021-10-13

import irvine.oeis.a097.A097806;
import irvine.oeis.a130.A130296;
import irvine.oeis.triangle.Product;

/**
 * A131033 A130296 * A097806.
 * @author Georg Fischer
 */
public class A131033 extends Product {

  /** Construct the sequence. */
  public A131033() {
    super(1, new A130296(), new A097806());
  }
}
