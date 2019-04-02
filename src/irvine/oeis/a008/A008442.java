package irvine.oeis.a008;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A008442 Expansion of Jacobi theta constant (theta_2(2z))^2/4.
 * @author Sean A. Irvine
 */
public class A008442 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A008442() {
    super(new PeriodicSequence(0, 0, 0, 2, 0, 0, 0, -2), 0);
  }
}

