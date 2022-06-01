package irvine.oeis.a008;

import irvine.oeis.transform.EulerTransformSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A008439 Expansion of Jacobi theta constant theta_2^5 /32.
 * @author Sean A. Irvine
 */
public class A008439 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A008439() {
    super(new PeriodicSequence(5, -5), 0);
  }
}

