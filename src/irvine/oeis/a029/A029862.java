package irvine.oeis.a029;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A029862 Expansion of <code>q^(5/24) / (eta(q) * eta(q^2)^2)</code> in powers of q.
 * @author Sean A. Irvine
 */
public class A029862 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A029862() {
    super(new PeriodicSequence(1, 3), 0);
  }
}
