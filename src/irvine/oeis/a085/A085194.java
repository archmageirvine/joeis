package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A085194 Terms of A085193 halved. The repeating part in the first differences of A057520.
 * @author Sean A. Irvine
 */
public class A085194 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A085194() {
    super(0, new A085193(), Z::divide2);
  }
}
