package irvine.oeis.a008;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A008440 Expansion of Jacobi theta constant theta_2^6 /(64q^(3/2)).
 * @author Sean A. Irvine
 */
public class A008440 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A008440() {
    super(new PeriodicSequence(6, -6), 0);
  }
}

