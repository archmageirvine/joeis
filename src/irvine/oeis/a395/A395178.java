package irvine.oeis.a395;

import irvine.math.z.Z;
import irvine.oeis.a000.A000043;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A395178 Squares of Mersenne prime exponents A000043.
 * @author Sean A. Irvine
 */
public class A395178 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A395178() {
    super(new A000043(), Z::square);
  }
}
