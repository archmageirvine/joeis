package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A030218 Expansion of <code>eta(q^3) * eta(q^5) * eta(q^6) * eta(q^10)</code> in powers of q.
 * @author Sean A. Irvine
 */
public class A030218 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A030218() {
    super(new PeriodicSequence(0, 0, -1, 0, -1, -2, 0, 0, -1, -2, 0, -2, 0, 0, -2, 0, 0, -2, 0, -2, -1, 0, 0, -2, -1, 0, -1, 0, 0, -4), 0, Z.ZERO);
  }
}
