package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A045631 Number of 2n-bead black-white reversible complementable strings with n black beads and fundamental period 2n.
 * @author Sean A. Irvine
 */
public class A045631 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A045631() {
    super(0, new A045723(), 1, Z.ONE);
  }
}
