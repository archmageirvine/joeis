package irvine.oeis.a100;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A100130 Expansion of <code>(eta(q) * eta(q^4) / eta(q^2)^2)^24</code> in powers of q.
 * @author Sean A. Irvine
 */
public class A100130 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A100130() {
    super(new PeriodicSequence(-24, 24, -24, 0), 0);
  }
}
