package irvine.oeis.a118;

import irvine.math.z.Z;
import irvine.oeis.a008.A008836;
import irvine.oeis.transform.EulerTransform;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A118205 Euler transform of the negative of the Liouville function.
 * @author Georg Fischer
 */
public class A118205 extends EulerTransform {

  /** Construct the sequence. */
  public A118205() {
    super(new SimpleTransformSequence(new A008836(), Z::negate), 1);
  }
}
