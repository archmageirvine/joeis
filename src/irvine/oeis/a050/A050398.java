package irvine.oeis.a050;

import irvine.oeis.ExponentialRevertTransformSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000085;

/**
 * A050398 Exponential reversion of sequence of involutions (A000085).
 * @author Sean A. Irvine
 */
public class A050398 extends ExponentialRevertTransformSequence {

  /** Construct the sequence. */
  public A050398() {
    super(new SkipSequence(new A000085(), 1));
  }
}
