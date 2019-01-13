package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.MobiusTransformSequence;

/**
 * A000837.
 * @author Sean A. Irvine
 */
public class A000837 extends MobiusTransformSequence {

  /** Construct this sequence. */
  public A000837() {
    super(new A000041(), 1, Z.ONE);
  }
}
