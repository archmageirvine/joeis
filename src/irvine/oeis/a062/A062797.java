package irvine.oeis.a062;

import irvine.oeis.a002.A002110;
import irvine.oeis.transform.InverseMobiusTransformSequence;

/**
 * A062797 Inverse Moebius transform of f(x) = primorial(x) = A002110(x).
 * @author Sean A. Irvine
 */
public class A062797 extends InverseMobiusTransformSequence {

  /** Construct the sequence. */
  public A062797() {
    super(0, new A002110(), 1);
    next();
  }
}
