package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A084007 a(n) = A084006(n)^(1/2).
 * @author Sean A. Irvine
 */
public class A084007 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A084007() {
    super(1, new A084006(), Z::sqrt);
  }
}
