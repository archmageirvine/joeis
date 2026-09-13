package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A086542 a(n) = A086541(n)^(1/2).
 * @author Sean A. Irvine
 */
public class A086542 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A086542() {
    super(1, new A086541(), Z::sqrt);
  }
}
