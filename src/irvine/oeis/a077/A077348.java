package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A077348 a(n) = A077346(n)^(1/2).
 * @author Sean A. Irvine
 */
public class A077348 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A077348() {
    super(1, new A077346(), Z::sqrt);
  }
}

