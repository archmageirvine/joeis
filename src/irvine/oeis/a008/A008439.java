package irvine.oeis.a008;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.transform.EulerTransform;

/**
 * A008439 Expansion of Jacobi theta constant theta_2^5 /32.
 * @author Sean A. Irvine
 */
public class A008439 extends EulerTransform {

  /** Construct the sequence. */
  public A008439() {
    super(0, new PeriodicSequence(5, -5), 1);
  }
}

