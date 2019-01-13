package irvine.oeis.a002;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.EulerTransformSequence;

/**
 * A002509.
 * @author Sean A. Irvine
 */
public class A002509 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A002509() {
    super(new PeriodicSequence(-1, 4, -1, 4, -1, 4, 6, 4, -1, 4, -1, 4, -1, 0), 0);
  }
}
