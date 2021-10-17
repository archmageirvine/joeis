package irvine.oeis.a134;
// manually triprod at 2021-10-13

import irvine.oeis.AbsoluteSequence;
import irvine.oeis.a049.A049310;
import irvine.oeis.a097.A097806;
import irvine.oeis.triangle.Product;

/**
 * A134513 A049310 * A097806.
 * @author Georg Fischer
 */
public class A134513 extends Product {

  /** Construct the sequence. */
  public A134513() {
    super(new AbsoluteSequence(new A049310()), new A097806());
  }
}
