package irvine.oeis.a050;

import irvine.oeis.ExponentialRevertTransformSequence;
import irvine.oeis.a008.A008683;

/**
 * A050386 Exponential reversion of Moebius function A008693.
 * @author Sean A. Irvine
 */
public class A050386 extends ExponentialRevertTransformSequence {

  /** Construct the sequence. */
  public A050386() {
    super(new A008683());
  }
}
