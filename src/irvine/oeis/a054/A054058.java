package irvine.oeis.a054;

import irvine.oeis.a000.A000031;
import irvine.oeis.transform.InverseMobiusTransformSequence;

/**
 * A054058 Inverse Moebius transform of A000031 (starting at term 0).
 * @author Sean A. Irvine
 */
public class A054058 extends InverseMobiusTransformSequence {

  /** Construct the sequence. */
  public A054058() {
    super(0, new A000031(), 0);
    next();
  }
}
