package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.a082.A082082;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A084426 Twice A082082.
 * @author Sean A. Irvine
 */
public class A084426 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A084426() {
    super(new A082082(), Z::multiply2);
  }
}
