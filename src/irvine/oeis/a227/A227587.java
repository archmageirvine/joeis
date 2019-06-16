package irvine.oeis.a227;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A227587 Expansion of <code>(phi(-q^3)^2 / (phi(-q) * phi(-q^9)))^2</code> in powers of q where <code>phi()</code> is a Ramanujan theta function.
 * @author Sean A. Irvine
 */
public class A227587 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A227587() {
    super(new PeriodicSequence(4, 2, -4, 2, 4, -2, 4, 2, 0, 2, 4, -2, 4, 2, -4, 2, 4, 0), 0);
  }
}
