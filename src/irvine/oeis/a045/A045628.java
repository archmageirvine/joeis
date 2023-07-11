package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.a005.A005648;
import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A045628 Number of 2n-bead black-white reversible necklaces with n black beads and fundamental period 2n.
 * @author Sean A. Irvine
 */
public class A045628 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A045628() {
    super(0, new A005648(), 1, Z.ONE);
  }
}
