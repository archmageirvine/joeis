package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.a032.A032123;
import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A045627 Number of 2n-bead black-white reversible strings with n black beads and fundamental period 2n.
 * @author Sean A. Irvine
 */
public class A045627 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A045627() {
    super(0, new A032123(), 1, Z.ONE);
  }
}
