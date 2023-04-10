package irvine.oeis.a062;

import irvine.oeis.a000.A000720;
import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A062778 Values of Moebius-transform of PrimePi function.
 * @author Sean A. Irvine
 */
public class A062778 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A062778() {
    super(new A000720(), 0);
    next();
  }
}
