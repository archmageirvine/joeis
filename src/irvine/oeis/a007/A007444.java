package irvine.oeis.a007;

import irvine.oeis.MobiusTransformSequence;
import irvine.oeis.a000.A000040;

/**
 * A007444.
 * @author Sean A. Irvine
 */
public class A007444 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A007444() {
    super(new A000040(), 0);
    next();
  }
}
