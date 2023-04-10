package irvine.oeis.a062;

import irvine.oeis.a051.A051953;
import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A062790 Moebius transform of the cototient function A051953.
 * @author Sean A. Irvine
 */
public class A062790 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A062790() {
    super(new A051953(), 0);
    next();
  }
}
