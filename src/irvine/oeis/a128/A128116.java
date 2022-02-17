package irvine.oeis.a128;
// manually triprod at 2021-10-10 18:53

import irvine.oeis.AbsoluteSequence;
import irvine.oeis.a122.A122432;
import irvine.oeis.triangle.Product;

/**
 * A128116 A128064 * A122432 (unsigned).
 * @author Georg Fischer
 */
public class A128116 extends Product {

  /** Construct the sequence. */
  public A128116() {
    super(new A128064(), new AbsoluteSequence(new A122432()));
  }
}
