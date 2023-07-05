package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a225.A225923;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A002292 Related to representation as sums of squares.
 * @author Sean A. Irvine
 */
public class A002292 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A002292() {
    super(new A225923(), Z::abs);
  }
}
