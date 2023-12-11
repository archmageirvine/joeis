package irvine.oeis.a050;

import irvine.oeis.a000.A000009;
import irvine.oeis.transform.ExponentialRevertTransformSequence;

/**
 * A050394 Exponential reversion of partitions into distinct parts A000009.
 * @author Sean A. Irvine
 */
public class A050394 extends ExponentialRevertTransformSequence {

  /** Construct the sequence. */
  public A050394() {
    super(new A000009().skip(1));
  }
}
