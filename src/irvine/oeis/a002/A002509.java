package irvine.oeis.a002;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.EulerTransformSequence;

/**
 * A002509 Expansion of a modular function for <code>Gamma_0(14)</code>.
 * @author Sean A. Irvine
 */
public class A002509 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A002509() {
    super(new PeriodicSequence(-1, 4, -1, 4, -1, 4, 6, 4, -1, 4, -1, 4, -1, 0), 0);
  }
}
