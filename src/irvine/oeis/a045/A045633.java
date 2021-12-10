package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.transform.MobiusTransformSequence;
import irvine.oeis.a006.A006840;

/**
 * A045633 Number of 2n-bead black-white reversible complementable necklaces with n black beads and fundamental period 2n.
 * @author Sean A. Irvine
 */
public class A045633 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A045633() {
    super(new A006840(), 1, Z.ONE);
  }
}
