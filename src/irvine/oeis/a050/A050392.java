package irvine.oeis.a050;

import irvine.oeis.a000.A000010;
import irvine.oeis.transform.ExponentialRevertTransformSequence;

/**
 * A050392 Exponential reversion of Euler totient function A000010.
 * @author Sean A. Irvine
 */
public class A050392 extends ExponentialRevertTransformSequence {

  /** Construct the sequence. */
  public A050392() {
    super(new A000010());
  }
}
