package irvine.oeis.a134;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A134414 Expansion of <code>eta(q)^2 / (eta(q^2) * eta(q^4)^6)</code> in powers of q.
 * @author Sean A. Irvine
 */
public class A134414 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A134414() {
    super(new PeriodicSequence(-2, -1, -2, 5), 0);
  }
}
