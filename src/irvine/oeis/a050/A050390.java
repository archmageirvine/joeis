package irvine.oeis.a050;

import irvine.oeis.a000.A000005;
import irvine.oeis.transform.ExponentialRevertTransformSequence;

/**
 * A050390 Exponential reversion of divisor function A000005.
 * @author Sean A. Irvine
 */
public class A050390 extends ExponentialRevertTransformSequence {

  /** Construct the sequence. */
  public A050390() {
    super(new A000005());
  }
}
