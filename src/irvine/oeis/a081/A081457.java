package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A081457 a(n) = A081456(n)^(1/2).
 * @author Sean A. Irvine
 */
public class A081457 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A081457() {
    super(1, new A081456(), Z::sqrt);
  }
}
