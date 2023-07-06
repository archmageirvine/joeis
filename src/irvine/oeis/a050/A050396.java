package irvine.oeis.a050;

import irvine.oeis.transform.ExponentialRevertTransformSequence;
import irvine.oeis.a000.A000081;

/**
 * A050396 Exponential reversion of rooted trees A000081.
 * @author Sean A. Irvine
 */
public class A050396 extends ExponentialRevertTransformSequence {

  /** Construct the sequence. */
  public A050396() {
    super(new A000081().skip(1));
  }
}
