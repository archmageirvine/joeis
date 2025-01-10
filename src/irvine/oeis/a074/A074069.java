package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.PartialSumSequence;
import irvine.oeis.a068.A068119;

/**
 * A074069 Numbers n such that S(n) = 3n (see A068119).
 * @author Sean A. Irvine
 */
public class A074069 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A074069() {
    super(1, 1, new PartialSumSequence(new A068119()), (n, k) -> k.equals(Z.THREE.multiply(n)));
  }
}
