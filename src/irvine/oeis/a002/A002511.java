package irvine.oeis.a002;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.EulerTransformSequence;

/**
 * A002511 Expansion of a modular function for Gamma_0(21).
 * @author Sean A. Irvine
 */
public class A002511 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A002511() {
    super(new PeriodicSequence(1, 1, 4, 1, 1, 4, 6, 1, 4, 1, 1, 4, 1, 6, 4, 1, 1, 4, 1, 1, 0), 0);
  }
}
