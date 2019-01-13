package irvine.oeis.a008;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A008439.
 * @author Sean A. Irvine
 */
public class A008439 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A008439() {
    super(new PeriodicSequence(5, -5), 0);
  }
}

