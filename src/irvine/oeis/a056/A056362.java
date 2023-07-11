package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A056362 Number of primitive (period n) bracelet structures using a maximum of three different colored beads.
 * @author Sean A. Irvine
 */
public class A056362 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A056362() {
    super(0, new A056353(), 1, Z.ONE);
  }
}
