package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A056363 Number of primitive (period n) bracelet structures using a maximum of four different colored beads.
 * @author Sean A. Irvine
 */
public class A056363 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A056363() {
    super(0, new A056354(), 1, Z.ONE);
  }
}
