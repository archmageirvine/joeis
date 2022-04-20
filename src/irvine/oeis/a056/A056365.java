package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A056365 Number of primitive (period n) bracelet structures using a maximum of six different colored beads.
 * @author Sean A. Irvine
 */
public class A056365 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A056365() {
    super(new A056356(), 1, Z.ONE);
  }
}
