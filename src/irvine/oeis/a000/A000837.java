package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A000837 Number of partitions of n into relatively prime parts. Also aperiodic partitions.
 * @author Sean A. Irvine
 */
public class A000837 extends MobiusTransformSequence {

  /** Construct this sequence. */
  public A000837() {
    super(new A000041(), 1, Z.ONE);
  }
}
