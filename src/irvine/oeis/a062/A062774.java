package irvine.oeis.a062;

import irvine.oeis.a000.A000720;
import irvine.oeis.transform.InverseMobiusTransformSequence;

/**
 * A062774 Inverse Moebius transform of PrimePi function.
 * @author Sean A. Irvine
 */
public class A062774 extends InverseMobiusTransformSequence {

  /** Construct the sequence. */
  public A062774() {
    super(new A000720(), 0);
    next();
  }
}
