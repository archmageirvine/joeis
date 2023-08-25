package irvine.oeis.a128;
// manually robots/triprod at 2023-08-23 09:55

import irvine.math.z.Z;
import irvine.oeis.a122.A122432;
import irvine.oeis.transform.SimpleTransformSequence;
import irvine.oeis.triangle.Product;

/**
 * A128142 A128132 * A122432 (unsigned).
 * @author Georg Fischer
 */
public class A128142 extends Product {

  /** Construct the sequence. */
  public A128142() {
    super(1, new SimpleTransformSequence(new A128132(), t -> t.abs()), new A122432());
  }

  @Override
  public Z next() {
    return super.next().abs();
  }
}

