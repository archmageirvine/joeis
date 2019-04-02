package irvine.oeis.a002;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.EulerTransformSequence;

/**
 * A002508 Expansion of a modular function for Gamma_0(6).
 * @author Sean A. Irvine
 */
public class A002508 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A002508() {
    super(new PeriodicSequence(-2, 8, 12, 8, -2, 0), 0);
  }
}
