package irvine.oeis.a128;

import irvine.math.z.Z;
import irvine.oeis.a122.A122432;
import irvine.oeis.transform.SimpleTransformSequence;
import irvine.oeis.triangle.Product;

/**
 * A128116 A128064 * A122432 (unsigned).
 * @author Georg Fischer
 */
public class A128116 extends Product {

  /** Construct the sequence. */
  public A128116() {
    super(1, new A128064(), new SimpleTransformSequence(new A122432(), Z::abs));
  }
}
