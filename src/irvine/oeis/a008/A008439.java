package irvine.oeis.a008;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A008439 Expansion of Jacobi theta constant theta_2^5 <code>/32</code>.
 * @author Sean A. Irvine
 */
public class A008439 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A008439() {
    super(new PeriodicSequence(5, -5), 0);
  }
}

