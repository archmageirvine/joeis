package irvine.oeis.a200;
// manually etman at 2023-02-01 22:30

import irvine.math.z.Z;
import irvine.oeis.a000.A000079;
import irvine.oeis.transform.EulerTransform;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A200751 Expansion of Product_{k&gt;0} (1 - x^k)^(2^(k-1)) in powers of x.
 * @author Georg Fischer
 */
public class A200751 extends EulerTransform {

  /** Construct the sequence. */
  public A200751() {
    super(0, new SimpleTransformSequence(new A000079(), Z::negate), 1);
  }
}
