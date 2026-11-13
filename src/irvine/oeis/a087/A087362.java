package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A087362 a(n) = A087361(n)^(1/2).
 * @author Sean A. Irvine
 */
public class A087362 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A087362() {
    super(1, new A087361(), Z::sqrt);
  }
}
