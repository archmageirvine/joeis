package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.MobiusTransformSequence;

/**
 * A045683 Number of 2n-bead balanced binary necklaces of fundamental period 2n which are equivalent to their reverse, complement and reversed complement.
 * @author Sean A. Irvine
 */
public class A045683 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A045683() {
    super(new A045674(), 1, Z.ONE);
  }
}

