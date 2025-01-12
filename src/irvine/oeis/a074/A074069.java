package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.PartialSumSequence;
import irvine.oeis.a068.A068119;

/**
 * A074069 Numbers k such that S(k) = Sum_{i=1..k} A068119(i) = 3*k.
 * @author Sean A. Irvine
 */
public class A074069 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A074069() {
    super(1, 1, new PartialSumSequence(new A068119()), (n, k) -> k.equals(Z.THREE.multiply(n)));
  }
}
