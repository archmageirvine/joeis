package irvine.oeis.a128;
// manually robots/triprod at 2023-08-23 09:55

import irvine.oeis.a122.A122432;
import irvine.oeis.transform.SimpleTransformSequence;
import irvine.oeis.triangle.Product;

/**
 * A128141 A122432 (unsigned) * A128132.
 * @author Georg Fischer
 */
public class A128141 extends Product {

  /** Construct the sequence. */
  public A128141() {
    super(1, new SimpleTransformSequence(new A122432(), t -> t.abs()), new A128132());
  }
}
