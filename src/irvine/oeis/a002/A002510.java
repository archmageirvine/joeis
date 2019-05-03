package irvine.oeis.a002;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.EulerTransformSequence;

/**
 * A002510 Expansion of a modular function for <code>Gamma_0(15)</code>.
 * @author Sean A. Irvine
 */
public class A002510 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A002510() {
    super(new PeriodicSequence(1, 1, 6, 1, 8, 6, 1, 1, 6, 8, 1, 6, 1, 1, 0), 0);
  }
}
