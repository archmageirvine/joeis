package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A045632 Number of 2n-bead black-white complementable necklaces with n black beads and fundamental period 2n.
 * @author Sean A. Irvine
 */
public class A045632 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A045632() {
    super(new A045629(), 1, Z.ONE);
  }
}
