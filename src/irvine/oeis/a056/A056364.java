package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A056364 Number of primitive (period n) bracelet structures using a maximum of five different colored beads.
 * @author Sean A. Irvine
 */
public class A056364 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A056364() {
    super(0, new A056355(), 1, Z.ONE);
  }
}
